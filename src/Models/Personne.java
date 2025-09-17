package Models;

public abstract class Personne{

    public String nom;
    public String prenom;
    public String email;
    public String motDePass;

    public Personne(String nom, String prenom, String email, String motDePass) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePass = motDePass;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }
}
