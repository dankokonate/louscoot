package models;

import java.util.*;

/**
 * 
 */
public class Employer extends Personnes {

    /**
     * Default constructor
     */
    public Employer(Date dateE, String fonction, float salaire,int Id,String Nom, String prenom, String ad, Date dateN) {
    	super(Id,Nom,prenom,ad,dateN);
    	this.dateE=dateE;
    	this.fonction=fonction;
    	this.salaire=salaire;
    	employer= new ArrayList<Location>();
    }
    public void AffichEmp() {
    	System.out.println("les information sur les Employer" + dateE+ fonction+ salaire+ IdPersonne+ Nom+ prenom+ ad+ dateN );
    }

    /**
     * 
     */
    public Date dateE;

    /**
     * 
     */
    public String fonction;

    /**
     * 
     */
    public float salaire;

    /**
     * 
     */
    public ArrayList<Location> employer;

}