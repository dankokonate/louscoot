package models;

import java.util.*;

/**
 * 
 */
public class Personnes {

    /**
     * Default constructor
     */
    public Personnes(int IdPersonne,String Nom, String prenom, String ad, Date dateN) {
    	this.IdPersonne=IdPersonne;
    	this.Nom=Nom;
    	this.prenom=prenom;
    	this.ad=ad;
    	this.dateN=dateN;
    }
    
    public Personnes() {
		super();
		this.setIdPersonne((int) new java.util.Date().getTime());
		}

	/**
     * 
     */
    public int IdPersonne;

    /**
     * 
     */
    public String Nom;

    /**
     * 
     */
    public String prenom;

    /**
     * 
     */
    public String ad;

    /**
     * 
     */
    public Date dateN;
    
    public int getIdPersonne() {
		return IdPersonne;
	}

	

	public void setIdPersonne(int id) {
		IdPersonne = id;
	}

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

    

}