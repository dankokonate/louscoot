package models;

import java.util.*;

/**
 * 
 */
public class Clients extends Personnes {

    /**
     * Default constructor
     */
    public Clients(int Id, Date dateI, long numCarte, String numTel,String Nom, String prenom, String ad, Date dateN) {
    	super(Id,Nom,prenom,ad,dateN);
    	this.dateI=dateI;
    	this.numCarte=numCarte;
    	this.numTel=numTel;
    	listLocation=new ArrayList<Location>();
    	
    }
    
    
    public Clients() {
    	this.setIdClient((int) new java.util.Date().getTime());
    }


	public void affichClient() {
    	System.out.println("les informations du clients" +dateI+ numCarte+ numTel+ idClient+ Nom+ prenom+ ad+ dateN);
    	
    }
    
    private int idClient;

    /**
     * 
     */
    private Date dateI;

    /**
     * 
     */
    private long numCarte;

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

	public Date getDateI() {
		return dateI;
	}
	
	public void setDateI(java.util.Date date) {
		this.dateI = date;
	}
	
	public long getNumCarte() {
		return numCarte;
	}
	
	public void setNumCarte(long numCarte) {
		this.numCarte = numCarte;
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
				+ ", lice=" + lice + ", listLocation=" + listLocation + "]";
	}
    

}