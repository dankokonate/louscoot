package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Clients extends Personnes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor
     */
    public Clients( int idClient, String numCarte, String numTel,String Nom, String prenom, String ad, Date dateN) {
    	super(Nom,prenom,ad,dateN);
    	
    	this.numCarte=numCarte;
    	this.numTel=numTel;
    	this.idClient=idClient;
    	listLocation=new ArrayList<Location>();
    	this.setDateI(new Date());
    }
    
    
    public Clients() {
    	//this.setIdClient((int) new java.util.Date().getTime());
    	this.setDateI(new Date());
    }


	/*public void affichClient() {
    	System.out.println("les informations du clients" +dateI+ numCarte+ numTel+ idClient+ Nom+ prenom+ ad+ dateN);
    	
    }*/
    
    private int idClient;

    /**
     * 
     */
    private Date dateI;

    /**
     * 
     */
    private String numCarte;

    /**
     * 
     */
    private String numTel;

    /**
     * 
     */
    private Licence lice;

    /**
     * 
     */
    public ArrayList<Location> listLocation;
    public ArrayList<Clients> listClients;

	public Date getDateI() {
		return dateI;
	}
	
	public void setDateI(java.util.Date date) {
		this.dateI = date;
	}
	
	public String getNumCarte() {
		return numCarte;
	}
	
	public void setNumCarte(String string) {
		this.numCarte = string;
	}
	
	public String getNumTel() {
		return numTel;
	}
	
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	public Licence getLice() {
		return lice;
	}
	
	public void setLice(Licence lice) {
		this.lice = lice;
	}
	
	public ArrayList<Location> getListLocation() {
		return listLocation;
	}
	
	public void setListLocation(ArrayList<Location> listLocation) {
		this.listLocation = listLocation;
	}
	
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int id) {
		this.idClient = id;
	}


	@Override
	public String toString() {
		return "Clients [idClient=" + idClient + ", dateI=" + dateI + ", numCarte=" + numCarte + ", numTel=" + numTel
				+ ", lice=" + lice + ", listLocation=" + listLocation + ", nom= "+getNom()+", prenom= "+ getPrenom()+", adresse= "+getAd()+", dateN="+getDateN()+"]";
	}
    

}