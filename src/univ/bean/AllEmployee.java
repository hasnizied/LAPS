package univ.bean;
import univ.model.Personne;
import java.util.ArrayList;
public class AllEmployee {


    ArrayList<Developpeur> developpeur;
    ArrayList<Manager> manager;
    ArrayList<Personne> personne;
    public AllEmployee(ArrayList<Developpeur> developpeur, ArrayList<Manager> manager ) {
        this.developpeur = developpeur;
        this.manager = manager;
    }


    public ArrayList<Developpeur> getDeveloppeur() {
        return developpeur;
    }

    public void setDeveloppeur(ArrayList<Developpeur> developpeur) {
        this.developpeur = developpeur;
    }

    public ArrayList<Manager> getManager() {
        return manager;
    }

    public void setManager(ArrayList<Manager> manager) {
        this.manager = manager;
    }

    public String toString()
    {
       return  developpeur.toString()+" "+manager.toString() ;
    }

    public AllEmployee()
    {}



}
