import java.util.*;

/**
 * 
 */
public class Scooter {

    /**
     * Default constructor
     */
    public Scooter( int IdScoot, int kilometre, String Etat, Model Mscooter, Marque MarqScooter) {
    	this.IdScoot=IdScoot;
    	this.kilometre=kilometre;
    	this.Etat=Etat;
    	this.Mscooter=Mscooter;
    	
    	
    	listLocation= new ArrayList<Location>(); 
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

// CREATION DE MA BASE DE DONNEE//

public static ArrayList<Scooter> getScooter(){
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot10",220), new Marque("pegeot")));
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot20",220), new Marque("pegeot")));
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot30",220), new Marque("pegeot")));
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot40",220), new Marque("pegeot")));
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot50",220), new Marque("pegeot")));
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot60",220), new Marque("pegeot")));
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot70",220), new Marque("pegeot")));
	listScooter.add(new Scooter(12,150,"Normal",new Model("pegeot80",220), new Marque("pegeot")));

	return listScooter;
	
}
public void ajoutScoot(Scooter Scoot) {
	listScooter.add(Scoot);
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

}
