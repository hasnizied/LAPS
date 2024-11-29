package univ.bean;

import univ.model.Personne;

public class Developpeur extends Personne {
    private String specialite;
    private Personne personne;


    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }



    public Developpeur(String specialite,Personne personne  ) {


       this.specialite = specialite;
       this.personne = personne;


    }


    public Developpeur( ) {

    }


    public String toString()
    {
        return this.personne + " " + this.specialite  ;
    }


}
