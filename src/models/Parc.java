package models;

import java.util.*;

/**
 * 
 */
public class Parc {

    /**
     * Default constructor
     */
    public Parc(int nbScoot, String nom_parc) {
    	this.nbScoot=nbScoot;
    	this.nom_parc=nom_parc;
    	listScooter= new ArrayList<Scooter>();
    	listClients= new ArrayList<Clients>();
    	listLocation= new ArrayList<Location>();
    	listEmployer = new ArrayList<Employer>();
    }
    public void AffichParc() {
    	System.out.println("Les informations sur le Parc:"+" "+nbScoot+" "+nom_parc);
    }
    /*public void Louer() {
    	System.out.println("Saisie Id Scooter");
    	Scanner clav= new Scanner(System.in);
    	IdScoot= clav.nextInt();
    }//*/
    
    /*
     * Cette Methode affiche la liste des Scooters dans le Parc
     */
    public static void AfficheListScoot() {
    	System.out.print("La liste des scooters:");
    	System.out.println(listScooter);
    }
    
    public boolean disponible(Date deb, Date fin) {
    	boolean disponible= true;
    	for(int i=0; i<listLocation.size();i++) {
    		Location res =listLocation.get(i);
    		if(deb.equals(res.dateLoc) && fin.equals(res.dateRe)) {
    			disponible=false;
    		}
    		
    	}
    	return disponible;
    }
    
    public void ajoutScoot( int IdScoot, int kilometre, String Etat, Model Mscooter, Marque MarqScooter ) {
    	 Scooter temp =new Scooter(12, 120, "normal", new Model("Peugeot10",120), new Marque("Peugeot"));
    	listScooter.add(temp);
    	 temp.Setparc(this);
    	
    	
    	
    }
   /* public void ajoutClient(Date dateI, long numCarte, long numTel,int Id,String Nom, String prenom, String ad, Date dateN) {
    	
    	listClients.add(new Clients( new Date(10,05,2020),0102030405,02154,001, "Danko", "Konate", "1 rue jules Valles" ,new Date(10,01,1996)));
    }
    */


    /**
     * 
     */
    public int nbScoot;

    /**
     * 
     */
    public String nom_parc;

    /**
     * 
     */
    public static ArrayList<Scooter> listScooter;
    public ArrayList<Clients> listClients;
    public ArrayList<Location> listLocation;
    public ArrayList<Employer> listEmployer;

    /**
     * 
     */
    public static  void affich_menu() {
        // TODO implement here
    	System.out.println(listScooter);
    }

    /**
     * 
     */
    public  void choix() {
        // TODO implement here
    }

}