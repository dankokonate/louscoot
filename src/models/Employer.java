package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Employer extends Personnes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor
     */
    public Employer(int IdEmployer,Date dateE, String fonction, float salaire,String Nom, String prenom, String ad, Date dateN) {
    	super(Nom,prenom,ad,dateN);
    	this.dateE=dateE;
    	this.fonction=fonction;
    	this.salaire=salaire;
    	listLocations= new ArrayList<Location>();
    	listEmployer= new ArrayList<Employer>();
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
    public ArrayList<Location> listLocations;
    public ArrayList<Employer> listEmployer;

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
		return listLocations;
	}

	public void setLocation(ArrayList<Location> locations) {
		this.listLocations = locations;
	}

	@Override
	public String toString() {
		return "Employer [dateE=" + dateE + ", fonction=" + fonction + ", salaire=" + salaire + ", employer=" + listLocations
				+ "]";
	}

}