package univ.bean;

import univ.model.Personne;

public class Manager extends Personne {
    private String service;
    private Personne personne;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }





    public Manager(String service,Personne personne ) {
        this.service = service;
        this.personne = personne;
    }


    public String toString()
    {
        return this.personne + " " + this.service  ;
    }
}
