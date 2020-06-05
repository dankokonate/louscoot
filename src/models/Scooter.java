package models;
import java.io.Serializable;
import java.util.*;



/**
 * 
 */
public class Scooter implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Default constructor
     */
    public Scooter( int IdScoot, int kilometre, Boolean Etat, Model Mscooter, Marque MarqScooter) {
    	this.IdScoot=IdScoot;
    	this.kilometre=kilometre;
    	this.Etat=Etat;
    	this.Mscooter=Mscooter;
    	
    	
    	listLocation= new ArrayList<Location>(); 
    	
    }
    
    public Scooter() {
    	this.Etat = true;
    	//listScooter= new ArrayList<Scooter>();
    }

	public void Setparc(Parc p) {
		
		Pscooter= p;
	}

    /**
     * 
     */
    public int IdScoot;

    /**
     * 
     */
    public int kilometre;

    /**
     * 
     */
    public boolean Etat;

    /**
     * 
     */
    public Parc Pscooter;

    /**
     * 
     */
    public Model Mscooter;

    /**
     * 
     */
    public ArrayList<Location> listLocation;
    public static ArrayList<Scooter>listScooter;

	public int getIdScoot() {
		return IdScoot;
	}
	
	
	
	public void setIdScoot(int idScoot) {
		IdScoot = idScoot;
	}
	
	
	
	public int getKilometre() {
		return kilometre;
	}
	
	
	
	public void setKilometre(int kilometre) {
		this.kilometre = kilometre;
	}
	
	
	
	public boolean getEtat() {
		return Etat;
	}
	
	
	
	public void setEtat(Boolean etat) {
		Etat = etat;
	}
	
	
	
	public Parc getPscooter() {
		return Pscooter;
	}
	
	
	
	public void setPscooter(Parc pscooter) {
		Pscooter = pscooter;
	}
	
	
	
	public Model getMscooter() {
		return Mscooter;
	}
	
	
	
	public void setMscooter(Model mscooter) {
		Mscooter = mscooter;
	}
	
	
	
	public ArrayList<Location> getListLocation() {
		return listLocation;
	}
	
	
	
	public void setListLocation(ArrayList<Location> listLocation) {
		this.listLocation = listLocation;
	}
	
	public static ArrayList<Scooter> getListScooter() {
		return listScooter;
	}
	
	
	
	public static void setListScooter(ArrayList<Scooter> listScooter) {
		Scooter.listScooter = listScooter;
	}
	
	
	
	@Override
	public String toString() {
		return "Scooter [IdScoot=" + IdScoot + ", kilometre=" + kilometre + ", Etat=" + Etat + ", Pscooter=" + Pscooter
				+ ", Mscooter=" + Mscooter + ", listLocation=" + listLocation + "]";
	}
}
