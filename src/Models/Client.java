package Models;

import java.util.HashMap;

public class Client extends Personne{
    public int idClient;
    private HashMap<String, Compte> comptes;

    public Client(String nom, String prenom, String email, String motDePass, int idClient, HashMap<String, Compte> comptes) {
        super(nom, prenom, email, motDePass);
        this.idClient = idClient;
        this.comptes = comptes;
    }

    public int getIdClient() {
        return idClient;
    }

    public HashMap<String, Compte> getComptes() {
        return comptes;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setComptes(HashMap<String, Compte> comptes) {
        this.comptes = comptes;
    }
}
