package models;

import java.util.*;

/**
 * 
 */
public class Model {
	

    /**
     * Default constructor
     */
    public Model(String nomModel,int puissance) {
    	this.nomModel=nomModel;
    	this.puissance=puissance;
    	listScooter= new ArrayList<Scooter>();
    	
    }

    /**
     * 
     */
    public String nomModel;

    /**
     * 
     */
    public int puissance;

    /**
     * 
     */
    public Marque Marquemodel;

    /**
     * 
     */
    public ArrayList<Scooter>listScooter;

    /**
     * 
     */
    public Licence listmodel;

    /**
     * @param String nom 
     * @param int puissance
     */
  /*  public void Model(String nom,  int puissance) {
        // TODO implement here
    }
*/
}