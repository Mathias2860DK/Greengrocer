package CashierPackage;

import PasswordPackage.Password;

import java.util.Scanner;

public class Cashier {
    String loginNumber;
    String logingPassword; //Passwords are always numbers. However i use a String because i hash it.
    Scanner scanner;
    Password password = new Password();
    /*
    Creating a new user happens in another program. So the loginNumber and loginPassword are put in
    manually for the purpose of this program. The hashed password is likely in a database.
    */

    public Boolean login (){
        scanner = new Scanner(System.in);

        String loginNumber = "5"; //typed in manually for the purpose of this program.
        String loginPassword = "666"; //typed in manually for the purpose of this program.


        System.out.println("User Number:");
        String loginNumberTry = scanner.nextLine();
        System.out.println("Password: ");
        String loginPasswordTry = scanner.nextLine();
        String correctPassword = password.encruptedPassword(loginPasswordTry);
        while (!loginNumberTry.equals(loginNumber) || !logingPassword.equals(correctPassword) ){
            System.out.println("Error");
            login();
        }


        return true;
    }


}
