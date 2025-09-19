package Models;

import java.util.HashMap;
import java.util.HashSet;

public class Compte {
    public long numeroCompte;
    public double Sold;
    public String typeCompte;
    private HashSet<Transaction> historiqueTransactions;

    public Compte(long numeroCompte, double sold, String typeCompte, HashSet<Transaction> historiqueTransactions) {
        this.numeroCompte = numeroCompte;
        Sold = sold;
        this.typeCompte = typeCompte;
        this.historiqueTransactions = historiqueTransactions;
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




    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + Sold +
                ", typeCompte='" + typeCompte + '\'' +
                ", transactionHistory=" + historiqueTransactions +  // will call Transaction.toString()
                '}';
    }

}
