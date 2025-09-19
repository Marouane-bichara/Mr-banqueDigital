package Services;

import Models.Gestionnaire;

import java.util.HashMap;

public class ManagerService {

    private HashMap<Integer, Gestionnaire> managers;


    public ManagerService(HashMap<Integer, Gestionnaire> managers) {
        this.managers = managers;
    }


    public Gestionnaire getManagerById(int id) {
        return managers.get(id);
    }

    public Gestionnaire authenticate(String email, String password) {
        for (Gestionnaire g : managers.values()) {
            if (g.getEmail().equalsIgnoreCase(email) && g.getMotDePass().equals(password)) {
                return g;
            }
        }
        return null;
    }


}
