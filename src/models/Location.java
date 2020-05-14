package models;

import java.util.*;

/**
 * 
 */
public class Location {
int nbJourLoc=0;
    /**
     * Default constructor
     */
    public Location(int NumContrat, Date dateLoc, Date dateRe,int kiloAv, int kiloAp, float prix) {
    	this.NumContrat=NumContrat;
    	this.dateLoc=dateLoc;
    	this.dateRe=dateRe;
    	this.kiloAv=kiloAv;
    	this.kiloAp=kiloAp;
    	this.prix=prix;
    }
    public void AffichLoc() {
    	System.out.println("les informations sur la Location:"+ NumContrat+ dateLoc+ dateRe+ kiloAv+ kiloAp+ prix);
    	
    }
    
    public float CalculPrix(Date dateLoc, Date dateRe) {
    	
    	return(prix);
    }

    /**
     * 
     */
    public int NumContrat;

    /**
     * 
     */
    public Date dateLoc;

    /**
     * 
     */
    public Date dateRe;

    /**
     * 
     */
    public int kiloAv;

    /**
     * 
     */
    public int kiloAp;

    /**
     * 
     */
    public float prix;

    /**
     * 
     */
    public Clients clientlocation;

    /**
     * 
     */
    public Scooter Scooterlocation;

    /**
     * 
     */
    public Employer Employerlocation;

    /**
     * @param int Id_scoot 
     * @param int Id_pers 
     * @param Date dateLoc 
     * @param Date dateRe 
     * @param Double prix 
     * @param int contrat
     */
    public  void location( int Id_scoot, int Id_pers, Date dateLoc,  Date dateRe,  Double prix,  int contrat) {
        // TODO implement here
    }

}