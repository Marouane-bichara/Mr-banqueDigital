package Models;

import java.util.Date;

public class Transaction {
    public String type;
    public double montant;
    public Date date;
    public Compte compteSource;
    public Compte comptedestination;

    public Transaction(String type, double montant, Date date, Compte compteSource, Compte comptedestination) {
        this.type = type;
        this.montant = montant;
        this.date = date;
        this.compteSource = compteSource;
        this.comptedestination = comptedestination;
    }

    public String getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    public Compte getCompteSource() {
        return compteSource;
    }

    public Compte getComptedestination() {
        return comptedestination;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCompteSource(Compte compteSource) {
        this.compteSource = compteSource;
    }

    public void setComptedestination(Compte comptedestination) {
        this.comptedestination = comptedestination;
    }
}
