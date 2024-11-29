package univ.service;

import univ.bean.AllEmployee;
import univ.bean.Developpeur;
import univ.bean.Manager;
import univ.model.Personne;

import java.util.ArrayList;

public class Test {
    ArrayList<Developpeur> lstDeveloppeur = new ArrayList<Developpeur>();
    ArrayList<Manager> lstManager = new ArrayList<Manager>();
    ArrayList<AllEmployee> allEmployees = new ArrayList<AllEmployee>();





    public  void Affichage( ) {

        lstDeveloppeur.add(new Developpeur("PHP",new Personne(1,"SLIMANI","Sami","00000",2000.0,2000+2000*0.1  )));
        lstDeveloppeur.add(new Developpeur("Java",new Personne(2,"DRIDI","Fathi","11111",3500.0,3500+3500*0.1)));
        lstDeveloppeur.add(new Developpeur("Javascript",new Personne(3,"SLIMANI","Souhail","22222",2000.0,2000+2000*0.1)));
        lstManager.add(new Manager("Logistique",new Personne(1,"AYADI","Saoud","33333",2000.0,2000+2000*0.15)));
        lstManager.add(new Manager("RH",new Personne(2,"AYADI","Saoud","44444",3000.0,3000+3000*0.15)));




        System.out.println("--------------------------------------------------------------------------------------");


        for (Developpeur d : lstDeveloppeur) {
          System.out.println("Le salaire du Developpeur " + d.getPersonne().getNom() + " " + d.getPersonne().getPrenom() + " est : " + d.getPersonne().getSalaireNet() + " DT son service : " + d.getSpecialite()  );
        }

        for (Manager m : lstManager) {
             System.out.println(    "Le salaire du Manager " + m.getPersonne().getNom() + " " + m.getPersonne().getPrenom() + " est : " + m.getPersonne().getSalaireNet() + " DT son service : " + m.getService()  ) ;
        }
        System.out.println("--------------------------------------------------------------------------------------");


        System.out.println(  "Le nombre des employees est : " +  (lstDeveloppeur.size()   +  lstManager.size())  );

        System.out.println("--------------------------------------------------------------------------------------");


        allEmployees.add( new AllEmployee(lstDeveloppeur ,lstManager));
        for (AllEmployee d : allEmployees) {
            for (Developpeur  a : d.getDeveloppeur() ) {
                System.out.println(    "Le salaire du Developpeur " + a.getPersonne().getNom() + " " + a.getPersonne().getPrenom() + " est : " + a.getPersonne().getSalaireNet() + " DT son service : " + a.getSpecialite()  ) ;
            }
            for (Manager  a : d.getManager() ) {
                System.out.println(    "Le salaire du Manager " + a.getPersonne().getNom() + " " + a.getPersonne().getPrenom() + " est : " + a.getPersonne().getSalaireNet() + " DT son service : " + a.getService()  ) ;
            }

        }




    }





    public String toString()
    {
        return this.lstDeveloppeur.toString();
    }

}
