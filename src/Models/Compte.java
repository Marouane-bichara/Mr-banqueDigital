package Models;

import java.util.HashMap;
import java.util.HashSet;

public class Compte {
    public long numeroCompte;
    public double Sold;
    public String typeCompte;
    private HashSet<Transaction> historiqueTransactions;
    public Client client;

    public Compte(long numeroCompte, double sold, String typeCompte, HashSet<Transaction> historiqueTransactions, Client client) {
        this.numeroCompte = numeroCompte;
        Sold = sold;
        this.typeCompte = typeCompte;
        this.historiqueTransactions = historiqueTransactions;
        this.client = client;
    }

    public long getNumeroCompte() {
        return numeroCompte;
    }

    public double getSold() {
        return Sold;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public HashSet<Transaction> getHistoriqueTransactions() {
        return historiqueTransactions;
    }

    public Client getClient() {
        return client;
    }

    public void setNumeroCompte(long numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSold(double sold) {
        Sold = sold;
    }

    public void setHistoriqueTransactions(HashSet<Transaction> historiqueTransactions) {
        this.historiqueTransactions = historiqueTransactions;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
