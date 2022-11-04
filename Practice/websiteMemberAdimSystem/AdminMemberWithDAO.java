package websiteMemberAdimSystem;

import java.util.ArrayList;
import java.util.List;

public class AdminMemberWithDAO {
    public static void main(String[]args){
        PasswordInfoDAO passwordInfoDAO = new PasswordInfoDaoImpl();

        System.out.println("--- inserting ...");
        PasswordInfo passwordInfo1 = new PasswordInfo("https://www.smu.ac.kr","smu","abcde");
        PasswordInfo passwordInfo2 = new PasswordInfo("https://www.smu2.ac.kr", "smu2","abcde");
        passwordInfoDAO.insert(passwordInfo1);
        passwordInfoDAO.insert(passwordInfo2);

        System.out.println("---printing all account...");
        List<PasswordInfo> passwordInfoArrayList = passwordInfoDAO.findAll();

        for(PasswordInfo passwordInfo : passwordInfoArrayList){
            System.out.println(passwordInfo);
        }
        passwordInfoDAO.update("https://www.smu2.ac.kr",new PasswordInfo("https://www.smu2.ac.kr", "smu1","abcde"));

        System.out.println("---printing all account after update");
        passwordInfoArrayList = passwordInfoDAO.findAll();

        for(PasswordInfo passwordInfo : passwordInfoArrayList){
            System.out.println(passwordInfo);
        }

        passwordInfoDAO.delete("https://www.smu2.ac.kr");

        System.out.println("---printing all account after delete");
        passwordInfoArrayList = passwordInfoDAO.findAll();

        for(PasswordInfo passwordInfo : passwordInfoArrayList){
            System.out.println(passwordInfo);
        }



    }
}
