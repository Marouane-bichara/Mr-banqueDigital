package Models;

public class Gestionnaire extends Personne{
    public int idGestionnaire;

    public Gestionnaire(int idGestionnaire, String nom, String prenom, String email, String motDePass) {
        super(nom, prenom, email, motDePass);
        this.idGestionnaire = idGestionnaire;
    }

    public int getIdGestionnaire() {
        return idGestionnaire;
    }

    public void setIdGestionnaire(int idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }
}
