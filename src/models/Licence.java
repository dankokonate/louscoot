package models;

import java.util.*;

/**
 * 
 */
public class Licence {
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

}