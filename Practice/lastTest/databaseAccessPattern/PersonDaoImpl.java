package lastTest.databaseAccessPattern;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    final static String DB_FILE_NAME = "addrbook.db";//sqlite에서 사용할 데이터베이스 파일 이름
    final static String DB_TABLE_NAME = "persons";//파일 안에서 생성할 데이터 베이스 테이블 이름
    Connection connection = null;//Connection 클래스의 객체이다.DB와 연결할 때 사용하는 인터페이스로 이를 통해서 데이터 베이스와 연결한다.
    ResultSet rs = null;//connection을 통해서 실행한 sql의 결과가 반환되는 객체이다.
    Statement statement = null;//sql을 담는 인터페이스이다.

    public PersonDaoImpl() {
        final String table = " (ID INTEGER PRIMARY KEY AUTOINCREMENT, name text, address text)";
        try {
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:" + DB_FILE_NAME
            );//drive maager를 통해서 데이터 베이스에 연결하고 connection 갹채를 반환한다.
            statement = connection.createStatement();//sql을 실행할 statement 객체를 반환한다.
            statement.setQueryTimeout(30);//쿼리에 최대 실행시간이다.
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);//해당 이름을 가진 테이블이 존재한다면 삭제하고 다시 만듦
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);//위에서 삭제한 태이블을 다시 만든다.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Person p) {
        try {
            String fmt = "INSERT INTO %S VALUES(%d,'%s','%s')";//sql을 저장할 문자열
            String q = String.format(fmt, DB_TABLE_NAME, p.getId(), p.getName(), p.getAddress());
            //함수를 통해서 전달받은 person 객체를 통해서 sql문을 완성한다 string format을 이용함.
            statement.execute(q);//sql문을 전달하고 실행하는데 항상 sql exception을 실행해서 오류 실행을 출력하게 작성해한다.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> findAll() {//database에 저장된 모든 person객체를 list형태로 반환하는 함수
        ArrayList<Person> persons = new ArrayList<Person>();
        try {
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);

            while (rs.next()) {
                persons.add(new Person(rs.getInt("id"),
                        rs.getString("name"), rs.getString("address")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public Person findById(int id) {//id를 이용해서 반환하는 함수
        Person person = null;
        try {
            String fmt = "SELECT * FROM %s WHERE id = %d";
            String q = String.format(fmt, DB_TABLE_NAME, id);
            rs = statement.executeQuery(q);
            //DB에서 객체를 반한환하는 sql을 실행하면 excuteQuery method를 사용해서 결과를 ResultSet객체로 받는다.

            if (rs.next()) {//set에 다른 객체의 사람이 있다면 실행함 사실 while문을 통해서 실행해도 되지만 본 과제에서 귀찮아서 그렇게 수행안함
                person = new Person(rs.getInt("id"), rs.getString("name"), rs.getString("address"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public void update(int id, Person p) {//삽입하는 함수
        Person person = findById(id);
        if (person != null) {
            try {
                String fmt = "UPDATE '%s' SET name = '%s', address = '%s' WHERE id = %d";
                String q = String.format(fmt, DB_TABLE_NAME, p.getName(), p.getAddress(), p.getId());
                statement.execute(q);//DB에 post 하는 sql문은 ResultSet을 사용할 필요가 없기때문에 void type인 excute함수를 사용한다.
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void delete(int id) {//삭제하는 함수이도 나머지 과정은 같다.
        try {
            String fmt = "DELETE FROM %s WHERE id = %d";
            String q = String.format(fmt, DB_TABLE_NAME, id);
            statement.execute(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Person p) {
        delete(p.getId());
    }


}
