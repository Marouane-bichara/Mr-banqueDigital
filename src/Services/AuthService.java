package Services;

import Models.AuthUsers;

import java.util.Scanner;

public class AuthService implements AuthUsers {

    public void loginGestionnaire ()
    {
        int choice2;
        String Email;
        String Password;
        Scanner scanner = new Scanner(System.in);
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isTrue = true;

            while(isTrue)
            {
                System.out.println("*******************");
                System.out.println("BANKING PROGRAME");
                System.out.println("*******************");
                System.out.print("Enter Your email : ");
                Email = scanner.nextLine();
                System.out.print("Enter Your Password : ");
                Password = scanner.nextLine();


                if (!Email.matches(emailRegex)) {
                    System.out.println("****************");
                    System.out.println("This is NOT a valid email.");
                    System.out.println("****************");
                    continue;
                }


                System.out.println(Email);
                System.out.println(Password);


                System.out.println("hello");
            }
    }

    public void loginClient()
    {
        System.out.println("hello");
    }
}
