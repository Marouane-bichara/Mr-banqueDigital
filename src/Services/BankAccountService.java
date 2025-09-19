package Services;

import Models.Client;

import java.util.ArrayList;
import java.util.HashMap;

public class BankAccountService {
    private int idClient;
    private HashMap<Integer, Client> clients;

    public BankAccountService(int idClient, HashMap<Integer, Client> clients) {
        this.idClient = idClient;
        this.clients = clients;
    }
    public HashMap<Integer, Client> getClients() {
        return clients;
    }



    public void setClients(HashMap<Integer, Client> clients) {
        this.clients = clients;
    }
}
