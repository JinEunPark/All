package websiteMemberAdimSystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordInfoDaoImpl implements PasswordInfoDAO {
    final static String DB_FILE_NAME = "passwordInformation.db";
    final static String DB_TABLE_NAME = "password_information";
    Connection connection;
    ResultSet resultSet;
    Statement statement;

    public PasswordInfoDaoImpl() {
        final String table = "(URL text PRIMARY KEY, id text, password text)";
        try {
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:" + DB_FILE_NAME
            );
            statement = connection.createStatement();
            statement.setQueryTimeout(30);
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.execute("CREATE TABLE " + DB_TABLE_NAME + table);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void insert(PasswordInfo p) {
        try {
            String fmt = "INSERT INTO %S VALUES('%s','%s','%s')";
            String q = String.format(fmt, DB_TABLE_NAME, p.getUrl(), p.getId(), p.getPassword());
            statement.execute(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<PasswordInfo> findAll() {
        ArrayList<PasswordInfo> passwordInfoArrayList = new ArrayList<>();
        try {
            String fmt = "SELECT * FROM %s";
            String q = String.format(fmt, DB_TABLE_NAME);
            resultSet = statement.executeQuery(q);


            while (resultSet.next()) {
                passwordInfoArrayList.add(new PasswordInfo(resultSet.getString("url"),
                        resultSet.getString("id"), resultSet.getString("password")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passwordInfoArrayList;
    }

    @Override
    public void update(String url ,PasswordInfo p) {
        try {
            String fmt = "UPDATE %s SET id = '%s', password = '%s' WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, p.getId(), p.getPassword(),url);
            statement.execute(q);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PasswordInfo findByKey(String url) {
        PasswordInfo passwordInfo = null;

        try {
            String fmt = "SELECT * FROM %s WHERE url='%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);
            resultSet = statement.executeQuery(q);

            if (resultSet.next()) {
                passwordInfo = new PasswordInfo(resultSet.getString("url"),
                        resultSet.getString("id"), resultSet.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passwordInfo;
    }

    @Override
    public void delete(PasswordInfo p) {
        delete(p.getUrl());

    }

    @Override
    public void delete(String url) {
        try {

            String fmt = "DELETE FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);
            statement.execute(q);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
