package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Electrique extends Scooter implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Default constructor
     */
    public Electrique (int autonomie,int IdScoot, int kilometre, String Etat, int nbScoot,Model Mscooter, Marque MarqScooter) {
    	super(IdScoot, kilometre, Etat,Mscooter,MarqScooter);
    	this.autonomie=autonomie;
    	listScooterE= new ArrayList<Electrique>();
    	listLocation = new ArrayList<Location>();
    }
    public void AfficScootElect() {
    	System.out.println("Les information sur les Scooters Electriques" + IdScoot+ kilometre+ Etat+ autonomie );
    }

    /**
     * 
     */
    public int autonomie;
    public ArrayList<Electrique> listScooterE;
    public ArrayList<Location> listLocation;
    

}