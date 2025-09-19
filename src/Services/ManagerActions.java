package Services;

import Models.Client;
import Models.Compte;
import Models.Transaction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ManagerActions {

    private String nome;
    private String prenome;
    private String email;
    private String password;
    BankService accounts = new BankService();

    public ManagerActions(String nome, String prenome, String email, String password) {
        this.nome = nome;
        this.prenome = prenome;
        this.email = email;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrenome() {
        return prenome;
    }

    public void setPrenome(String prenome) {
        this.prenome = prenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void createClientAccount()
    {

        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (isTrue)
        {
            System.out.println("           ");
            System.out.println("*******************");
            System.out.println("BANKING PROGRAME");
            System.out.println("*******************");
            System.out.println("           ");
            System.out.println("1. Create Current account.");
            System.out.println("2. Create Savings Account.");
            System.out.println("3. Back");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    this.enterClientInfoCurrent();
                    break;
                case 2:
                    this.enterClientSavings();
                    break;
                case 3: this.managerMenu();
                    break;
            }
        }
    }


//    public void newSavingaccountWithoutcurrentOne()
//    {
//        boolean isTrue = true;
//        Scanner scanner = new Scanner(System.in);
//
//
//
//
//
//
//
//        System.out.println("           ");
//        System.out.println("*******************");
//        System.out.println("BANKING PROGRAME");
//        System.out.println("*******************");
//        System.out.println("           ");
//        System.out.print("Enter client first name: ");
//        String prenom = scanner.nextLine();
//        System.out.print("Enter client last name: ");
//        String nom = scanner.nextLine();
//        System.out.print("Enter client email: ");
//        String email = scanner.nextLine();
//        System.out.print("Enter client password: ");
//        String password = scanner.nextLine();
//
////            BankService bankService = new BankService();
//
//        int clientId = (int) (Math.random() * 10000);
//        long accountNumber = (long) (Math.random() * 1000000);
//        double initialBalance = 0.0;
//        HashSet<Transaction> transactions = new HashSet<>();
//        Compte currentAccount = new Compte(accountNumber, initialBalance, "Current", transactions);
//        HashMap<String, Compte> clientAccounts = new HashMap<>();
//        clientAccounts.put("Current", currentAccount);
//        Client newClient = new Client(nom, prenom, email, password, clientId, clientAccounts);
//
//        System.out.println(newClient);
//        accounts.printAllClients();
//
//        this.createSvingAccountForClient();
//    }

    public void enterClientSavings()
    {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (isTrue)
        {
            System.out.println("           ");
            System.out.println("*******************");
            System.out.println("BANKING PROGRAME");
            System.out.println("*******************");
            System.out.println("           ");

            System.out.println("1. He already has an account.");
//            System.out.println("2. He does not have an account.");
            System.out.println("2. back");

            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    this.createSvingAccountForClient();
                    break;
//                case 2:
//                    this.newSavingaccountWithoutcurrentOne();
//                    break;
                case 2 :
                    this.createClientAccount();
                    break;
            }
        }
    }


    public void createSvingAccountForClient()
    {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
//        BankService accounts = new BankService();

        while (isTrue)
        {
            System.out.println("           ");
            System.out.println("*******************");
            System.out.println("BANKING PROGRAME");
            System.out.println("*******************");
            System.out.println("           ");

            System.out.print("Enter Client Account number : ");
            long accountNumber = scanner.nextLong();
            scanner.nextLine();
            System.out.println(accounts.getClientByAccountNumber(accountNumber));

            Client client = accounts.getClientByAccountNumber(accountNumber);


            if (client == null) {
                System.out.println("Client not found!");
                return;
            }

            long newAccountNumber = (long) (Math.random() * 1000000);
            double initialBalance = 0.0;
            String typeCompte = "Savings";

            Compte savingsAccount = new Compte(newAccountNumber, initialBalance, typeCompte, new HashSet<>());

            client.getComptes().put(typeCompte, savingsAccount);

            System.out.println(client);
            accounts.printAllClients();
            this.managerMenu();

        }
    }





    public void enterClientInfoCurrent()
    {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);







            System.out.println("           ");
            System.out.println("*******************");
            System.out.println("BANKING PROGRAME");
            System.out.println("*******************");
            System.out.println("           ");
            System.out.print("Enter client first name: ");
            String prenom = scanner.nextLine();
            System.out.print("Enter client last name: ");
            String nom = scanner.nextLine();
            System.out.print("Enter client email: ");
            String email = scanner.nextLine();
            System.out.print("Enter client password: ");
            String password = scanner.nextLine();

//            BankService bankService = new BankService();

            int clientId = (int) (Math.random() * 10000);
            long accountNumber = (long) (Math.random() * 1000000);
            double initialBalance = 0.0;
            HashSet<Transaction> transactions = new HashSet<>();
            Compte currentAccount = new Compte(accountNumber, initialBalance, "Current", transactions);
            HashMap<String, Compte> clientAccounts = new HashMap<>();
            clientAccounts.put("Current", currentAccount);
            Client newClient = new Client(nom, prenom, email, password, clientId, clientAccounts);
//            this.bankService.addClient(newClient);
//
        accounts.addClient(newClient);
        accounts.printAllClients();




    }



    public void modifyClientAccount()
    {
        int choice;
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        long accountNumber;
        String newNome;
        String newPreNome;
        int choice6;

        while (isTrue)
        {
            System.out.println("           ");
            System.out.println("*******************");
            System.out.println("BANKING PROGRAME");
            System.out.println("*******************");
            System.out.println("           ");
            System.out.println("1. Update Client name and last name.");
            System.out.println("2. Update Current Account balance.");
            System.out.println("3. Update Email account.");
            System.out.println("4. update password Account.");
            System.out.println("5. back");

            System.out.print("Enter your Choice : ");
            choice6 = scanner.nextInt();
            scanner.nextLine();

            switch (choice6)
            {
                case 1:
                    System.out.print("Enter your Account Number : ");
                    accountNumber = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter Your New last name : ");
                    newNome = scanner.next();
                    System.out.print("Enter your first name :");
                    newPreNome = scanner.next();

                    accounts.updateClientInfoByAccountNumber(accountNumber , newNome , newPreNome);
                    this.modifyClientAccount();
                    break;
                case 2:
                    System.out.print("Enter Account Number : ");
                    long aaccountNumber = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter The Balance : ");
                    double newsold = scanner.nextDouble();
                    scanner.nextLine();
                    accounts.updateCurrentAccountBalance(aaccountNumber , newsold);
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5 :
                    managerMenu();
                    break;
            }

        }
    }

    public void managerMenu()
    {
        int choice;
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);

        while (isTrue)
        {
            System.out.println("           ");
            System.out.println("*******************");
            System.out.println("BANKING PROGRAME");
            System.out.println("*******************");
            System.out.println("           ");
            System.out.println("Login successful: " + this.nome + " " + this.prenome);
            System.out.println("1. Create an Client Account.");
            System.out.println("2. Modify Client Account.");
            System.out.println("3. Close Client Account.");
            System.out.println("4.View any customer's bank statement.");
            System.out.println("5. Logout");
            System.out.print("Enter your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    this.createClientAccount();
                    break;
                case 2:
                    this.modifyClientAccount();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Logging out...");
                    Main.main(new String[] {});
            }


        }
        scanner.close();
    }
}
