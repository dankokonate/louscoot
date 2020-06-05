package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Model implements Serializable {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	@Override
	public String toString() {
		return "Model [nomModel=" + nomModel + ", puissance=" + puissance + ", Marquemodel=" + Marquemodel
				+ ", listScooter=" + listScooter + ", listmodel=" + listmodel + "]";
	}

    /**
     * @param String nom 
     * @param int puissance
     */
  /*  public void Model(String nom,  int puissance) {
        // TODO implement here
    }
*/
}