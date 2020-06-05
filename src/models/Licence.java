package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Licence implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

int nbJourLoc;
    /**
     * Default constructor
     */
    public Licence(float caution,char permis, int point) {
    	this.caution=caution;
    	this.permis=permis;
    	this.point=point;
    	listClients= new ArrayList<Clients>();
    	listModel= new ArrayList<Model>();
    	
    }
    public void AffichLicence() {
    	System.out.println("Les informations sur la Licence:" +caution+ permis+ point );
    }
    
    //Attribution de point aux Clients
   /* public int nbPoint(nbJourLoc) {
    	return(point);
    	
    }*/

    /**
     * 
     */
    public float caution;

    /**
     * 
     */
    public char permis;

    /**
     * 
     */
    public int point;

    /**
     * 
     */
    public ArrayList<Clients> listClients;

    /**
     * 
     */
    public ArrayList<Model> listModel;
	public int getNbJourLoc() {
		return nbJourLoc;
	}
	public void setNbJourLoc(int nbJourLoc) {
		this.nbJourLoc = nbJourLoc;
	}
	public float getCaution() {
		return caution;
	}
	public void setCaution(float caution) {
		this.caution = caution;
	}
	public char getPermis() {
		return permis;
	}
	public void setPermis(char permis) {
		this.permis = permis;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public ArrayList<Clients> getListClients() {
		return listClients;
	}
	public void setListClients(ArrayList<Clients> listClients) {
		this.listClients = listClients;
	}
	public ArrayList<Model> getListModel() {
		return listModel;
	}
	public void setListModel(ArrayList<Model> listModel) {
		this.listModel = listModel;
	}
	@Override
	public String toString() {
		return "Licence [nbJourLoc=" + nbJourLoc + ", caution=" + caution + ", permis=" + permis + ", point=" + point
				+ ", listClients=" + listClients + ", listModel=" + listModel + "]";
	}

}