package models;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Marque implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Default constructor
     */
    public Marque(String nomMarque) {
    	this.nomMarque=nomMarque;
    	marque= new ArrayList<Model>();
    }

    /**
     * 
     */
    public String nomMarque;

    /**
     * 
     */
    public ArrayList<Model> marque;

}