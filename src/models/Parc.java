package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Parc implements Serializable {

    /**
	 * 
	 */	
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor
     */
    public Parc(int nbScoot, String nom_parc) {
    	this.nbScoot=nbScoot;
    	this.nom_parc=nom_parc;
    	listScooter= new ArrayList<Scooter>();
    	listClients= new ArrayList<Clients>();
    	listLocation= new ArrayList<Location>();
    	listEmployer = new ArrayList<Employer>();
    }
    public void AffichParc() {
    	System.out.println("Les informations sur le Parc:"+" "+nbScoot+" "+nom_parc);
    }
    /*
     * Cette Methode affiche la liste des Scooters dans le Parc
     */
   
    
   /* public void ajoutClient(Date dateI, long numCarte, long numTel,int Id,String Nom, String prenom, String ad, Date dateN) {
    	
    	listClients.add(new Clients( new Date(10,05,2020),0102030405,02154,001, "Danko", "Konate", "1 rue jules Valles" ,new Date(10,01,1996)));
    }
    */


    /**
     * 
     */
    public int nbScoot;

    /**
     * 
     */
    public String nom_parc;

    /**
     * 
     */
    public ArrayList<Scooter> listScooter;
    public ArrayList<Clients> listClients;
    public ArrayList<Location> listLocation;
    public ArrayList<Employer> listEmployer;

    public int getNbScoot() {
		return nbScoot;
	}
	public void setNbScoot(int nbScoot) {
		this.nbScoot = nbScoot;
	}
	public String getNom_parc() {
		return nom_parc;
	}
	public void setNom_parc(String nom_parc) {
		this.nom_parc = nom_parc;
	}
	public ArrayList<Scooter> getListScooter() {
		return listScooter;
	}
	public void setListScooter(ArrayList<Scooter> listScooter) {
		this.listScooter = listScooter;
	}
	public ArrayList<Clients> getListClients() {
		return listClients;
	}
	public void setListClients(ArrayList<Clients> listClients) {
		this.listClients = listClients;
	}
	public ArrayList<Location> getListLocation() {
		return listLocation;
	}
	public void setListLocation(ArrayList<Location> listLocation) {
		this.listLocation = listLocation;
	}
	public ArrayList<Employer> getListEmployer() {
		return listEmployer;
	}
	public void setListEmployer(ArrayList<Employer> listEmployer) {
		this.listEmployer = listEmployer;
	}
	@Override
	public String toString() {
		return "Parc [nbScoot=" + nbScoot + ", nom_parc=" + nom_parc + ", listClients=" + listClients
				+ ", listLocation=" + listLocation + ", listEmployer=" + listEmployer + "]";
	}
	

    /**
     * 
     */

}