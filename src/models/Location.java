package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Location implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
    
    public Location() {
    	
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
    
    public ArrayList<Location> listLocation;
    public int getNbJourLoc() {
		return nbJourLoc;
	}

	public void setNbJourLoc(int nbJourLoc) {
		this.nbJourLoc = nbJourLoc;
	}

	public int getNumContrat() {
		return NumContrat;
	}

	public void setNumContrat(int numContrat) {
		NumContrat = numContrat;
	}

	public Date getDateLoc() {
		return dateLoc;
	}

	public void setDateLoc(Date dateLoc) {
		this.dateLoc = dateLoc;
	}

	public Date getDateRe() {
		return dateRe;
	}

	public void setDateRe(Date dateRe) {
		this.dateRe = dateRe;
	}

	public int getKiloAv() {
		return kiloAv;
	}

	public void setKiloAv(int kiloAv) {
		this.kiloAv = kiloAv;
	}

	public int getKiloAp() {
		return kiloAp;
	}

	public void setKiloAp(int kiloAp) {
		this.kiloAp = kiloAp;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Clients getClientlocation() {
		return clientlocation;
	}

	public void setClientlocation(Clients clientlocation) {
		this.clientlocation = clientlocation;
	}

	public Scooter getScooterlocation() {
		return Scooterlocation;
	}

	public void setScooterlocation(Scooter scooterlocation) {
		Scooterlocation = scooterlocation;
	}

	public Employer getEmployerlocation() {
		return Employerlocation;
	}

	public void setEmployerlocation(Employer employerlocation) {
		Employerlocation = employerlocation;
	}

	public ArrayList<Location> getListLocation() {
		return listLocation;
	}

	public void setListLocation(ArrayList<Location> listLocation) {
		this.listLocation = listLocation;
	}

	/**
     * @param int Id_scoot 
     * @param int Id_pers 
     * @param Date dateLoc 
     * @param Date dateRe 
     * @param Double prix 
     * @param int contrat
     */
	@Override
	public String toString() {
		return "Location [nbJourLoc=" + nbJourLoc + ", NumContrat=" + NumContrat + ", dateLoc=" + dateLoc + ", dateRe="
				+ dateRe + ", kiloAv=" + kiloAv + ", kiloAp=" + kiloAp + ", prix=" + prix + ", clientlocation="
				+ clientlocation + ", Scooterlocation=" + Scooterlocation + ", Employerlocation=" + Employerlocation
				+ ", listLocation=" + listLocation + "]";
	}
   

}