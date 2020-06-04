package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Moteur extends Scooter implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor
     */
    public Moteur(int capaciteR ,int IdScoot, int kilometre, String Etat, Model Mscooter, Marque MarqScooter) {
    	super(IdScoot, kilometre, Etat,Mscooter,MarqScooter);
    	this.capaciteR=capaciteR;
    }
    public void affichMoteur() {
    	System.out.println("Les informations sur les Scooter � Moteur:"+capaciteR+" "+IdScoot+" "+kilometre+" "+Etat);
    }

    /**
     * 
     */
    public int capaciteR;

}