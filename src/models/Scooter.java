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
    public Scooter( int IdScoot, int kilometre, String Etat, Model Mscooter, Marque MarqScooter) {
    	this.IdScoot=IdScoot;
    	this.kilometre=kilometre;
    	this.Etat=Etat;
    	this.Mscooter=Mscooter;
    	
    	
    	listLocation= new ArrayList<Location>(); 
    	
    }
    
    public Scooter() {
    	listScooter= new ArrayList<Scooter>();
    }
    
    

public boolean disponible(Date deb, Date fin) {
    	boolean disponible= true;
    	for(int i=0; i<listLocation.size();i++) {
    		Location res =listLocation.get(i);
    		if((deb.equals(res.dateLoc) && fin.equals(res.dateRe))
    			||(deb.before(res.dateLoc)&&(fin.after(res.dateRe))
    			||(fin.after(res.dateRe)&&(deb.before(res.dateLoc)))))
    				
    		 
    		{
    			disponible=false;
    		}
    		
    	}
    	return disponible;
    }

public static Scooter addScoot(Scooter Scoot) {
	listScooter.add(Scoot);
	return Scoot;
}

public void affichScoot() {
	for (int i=0; i<listScooter.size(); i++) {
		System.out.print(i+1+": "+listScooter.get(i).toString()+"\n");
	}
}
public Scooter FindById(int id) {
	Scooter scooter= new Scooter();
	for (int i=0; i<listScooter.size(); i++) {
		if(listScooter.get(i).getIdScoot()==id) {
			scooter = listScooter.get(id);
		}
	}
	 return scooter.getIdScoot()==0?null:scooter;
}

public boolean suppClient(int id)   {
	for (int i=0; i<listScooter.size(); i++) {
		if(listScooter.get(i).getIdScoot()==id) {
			listScooter.remove(id);
			return true;
		}
	}
	return false;

}

public Scooter modifClients(Scooter scooter ) {
	for (int i=0; i<listScooter.size(); i++) {
		if(listScooter.get(i).getIdScoot()==scooter.getIdScoot()) {
			listScooter.set(i, scooter);
			return scooter;
		}
	}
	return null;
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
    public String Etat;

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



public String getEtat() {
	return Etat;
}



public void setEtat(String etat) {
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
