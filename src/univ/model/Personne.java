package univ.model;

public class Personne   {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private Double salaireDeBase;
    private Double salaireNet;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Double getSalaireDeBase() {
        return salaireDeBase;
    }

    public void setSalaireDeBase(Double salaireDeBase) {
        this.salaireDeBase = salaireDeBase;
    }

    public Double getSalaireNet() {
        return salaireNet;
    }

    public void setSalaireNet(Double salaireNet) {
        this.salaireNet = salaireNet;
    }


    public Personne(int id, String nom, String prenom, String telephone, Double salaireDeBase, Double salaireNet) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.salaireDeBase = salaireDeBase;
        this.salaireNet = salaireNet;


    }

    public Personne( ) {



    }



    public String toString()
    {
        return  this.nom + " " + this.prenom + " " + this.telephone + " " + this.salaireDeBase + " " + this.salaireNet ;

    }

}
