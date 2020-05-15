package models;

import java.util.*;

/**
 * 
 */
public class Employer extends Personnes {

    /**
     * Default constructor
     */
    public Employer(int IdEmployer,Date dateE, String fonction, float salaire,String Nom, String prenom, String ad, Date dateN) {
    	super(Nom,prenom,ad,dateN);
    	this.dateE=dateE;
    	this.fonction=fonction;
    	this.salaire=salaire;
    	locations= new ArrayList<Location>();
    }
    
    public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}
    

    /**
     * 
     */
    public int IdEmployer;
    
    public int getIdEmployer() {
		return IdEmployer;
	}

	public void setIdEmployer(int idEmployer) {
		IdEmployer = idEmployer;
	}


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
    public ArrayList<Location> locations;

	public Date getDateE() {
		return dateE;
	}

	public void setDateE(Date dateE) {
		this.dateE = dateE;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public ArrayList<Location> getLocations() {
		return locations;
	}

	public void setLocation(ArrayList<Location> locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Employer [dateE=" + dateE + ", fonction=" + fonction + ", salaire=" + salaire + ", employer=" + locations
				+ "]";
	}

}