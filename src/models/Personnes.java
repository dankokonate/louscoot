package models;

import java.util.*;

/**
 * 
 */
public class Personnes {

    /**
     * Default constructor
     */
    public Personnes(String Nom, String prenom, String ad, Date dateN) {
    	this.Nom=Nom;
    	this.prenom=prenom;
    	this.ad=ad;
    	this.dateN=dateN;
    }
    
    public Personnes() {
		super();
		//this.setIdPersonne((int) new java.util.Date().getTime());
	}
    

    /**
     * 
     */
    private String Nom;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private String ad;

    /**
     * 
     */
    private Date dateN;
    
   /* public int getIdPersonne() {
		return IdPersonne;
	}

	

	public void setIdPersonne(int id) {
		IdPersonne = id;
	}*/

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Date getDateN() {
		return dateN;
	}

	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}

	@Override
	public String toString() {
		return "Personnes [ Nom=" + Nom + ", prenom=" + prenom + ", ad=" + ad + ", dateN="
				+ dateN + "]";
	}

    

}