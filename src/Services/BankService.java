package Services;

import Models.Client;
import Models.Compte;
import java.util.HashMap;

public class BankService {

    private HashMap<Integer, Client> accounts = new HashMap<>();

    public void addClient(Client client) {
        accounts.put(client.getIdClient(), client);
    }

    public Client getClient(int clientId) {
        return accounts.get(clientId);
    }

    public void updateClientInfoByAccountNumber(long accountNumber, String newNom, String newPrenom) {
        Client client = getClientByAccountNumber(accountNumber);

        if (client != null) {
            client.setNom(newNom);
            client.setPrenom(newPrenom);
            System.out.println("Client information updated successfully: " + client);
        } else {
            System.out.println("No client found with account number: " + accountNumber);
        }
    }

    public Client getClientByAccountNumber(long accountNumber) {
        for (Client client : accounts.values()) {
            System.out.println(" get ********************************");
            System.out.println(accounts.size());
            for (Compte compte : client.getComptes().values()) {
                if (compte.getNumeroCompte() == accountNumber) {
                    return client;
                }
            }
        }
        return null;
    }

    public void updateCurrentAccountBalance(long accountNumber, double newSold) {
        Client client = getClientByAccountNumber(accountNumber);

        if (client != null) {
            for (Compte compte : client.getComptes().values()) {
                if (compte.getNumeroCompte() == accountNumber) {
                    // Step 4: Update the balance
                    compte.setSold(newSold);
                    return;
                }
            }
        } else {
            System.out.println("No client found with account number: " + accountNumber);
        }
    }



    public void printAllClients() {
        for (Client client : accounts.values()) {
            System.out.println("all clients "+ client);
        }
    }
}
