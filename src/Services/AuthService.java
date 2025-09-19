package Services;

import Models.Gestionnaire;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AuthService{

    public void loginGestionnaire ()
    {
         HashMap<Integer, Gestionnaire> newmanagers = new HashMap<>();

        Random random = new Random();
        Random random2 = new Random();


        int randomNumber = random.nextInt();
        int randomNumber2 = random2.nextInt();

        Gestionnaire managers = new Gestionnaire(randomNumber , "Bichara" , "Marouane" , "marouaneBichara08@gmail.com" , "Agadirbasket1234b@");
        Gestionnaire managers2 = new Gestionnaire(randomNumber2 , "Aabila" , "said" , "saidAabila08@gmail.com" , "Agadirbasket1234b@");
        newmanagers.put(managers.getIdGestionnaire() , managers);
        newmanagers.put(managers2.getIdGestionnaire() , managers2);

        ManagerService gestService = new ManagerService(newmanagers);


//        System.out.println(gestService.getManagerById(2001).email);

        
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
                Gestionnaire manager = gestService.authenticate(Email, Password);

                if (manager != null) {
                    ManagerActions actions = new ManagerActions(manager.nom , manager.prenom , manager.email , manager.motDePass);
                    actions.managerMenu();
                } else {
                    System.out.println("Login failed!");
                    continue;
                }


            }
            scanner.close();
    }

    public void loginClient()
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
        scanner.close();
    }
}
