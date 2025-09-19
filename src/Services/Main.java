package Services;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isItTrue = true;
        AuthService auth = new AuthService();

        while (isItTrue)
        {

            System.out.println("*******************");
            System.out.println("BANKING PROGRAME");
            System.out.println("*******************");
            System.out.println("1. Login as a Client");
            System.out.println("2. Login as a Manager");
            System.out.println("3. Exit");
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            if (choice < 1 || choice > 3 ) {
                System.out.println("*******************");
                System.out.println("Invalid choice please enter a number between 1 and 3.");
                System.out.println("*******************");
                continue;
            }

            switch (choice)
            {
                case 1:
                    auth.loginClient();
                    break;
                case 2:
                    auth.loginGestionnaire();
                    break;
                case 3:
                    isItTrue = false;
                    break;
            }

        }

    }
}
