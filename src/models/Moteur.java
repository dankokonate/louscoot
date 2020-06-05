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
    public Moteur(int capaciteR ,int IdScoot, int kilometre, Boolean Etat, Model Mscooter, Marque MarqScooter) {
    	super(IdScoot, kilometre, Etat,Mscooter,MarqScooter);
    	this.capaciteR=capaciteR;
    }
    public void affichMoteur() {
    	System.out.println("Les informations sur les Scooter à Moteur:"+capaciteR+" "+IdScoot+" "+kilometre+" "+Etat);
    }

    /**
     * 
     */
    public int capaciteR;
    public int getCapaciteR() {
		return capaciteR;
	}
	public void setCapaciteR(int capaciteR) {
		this.capaciteR = capaciteR;
	}
	@Override
	public String toString() {
		return "Moteur [capaciteR=" + capaciteR + "]";
	}

}