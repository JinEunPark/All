package lastTest.databaseAccessPattern;

public class AddressBookWithDAO {
    public static void main(String[]args){
        Person p;
        PersonDao personDao = new PersonDaoImpl();
        System.out.println("---inserting...");
        p = new Person("jineun Park","1 hongjidong");
        personDao.insert(p);
        p = new Person("lee soo myung","2 hongji dong");
        personDao.insert(p);
        System.out.println("---finding all ...");
        for(Person person : personDao.findAll()){
            System.out.println("reading ..."+person);
        }
    }
}
