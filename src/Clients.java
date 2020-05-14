
import java.util.*;

/**
 * 
 */
public class Clients extends Personnes {

    /**
     * Default constructor
     */
    public Clients(Date dateI, long numCarte, long numTel,int Id,String Nom, String prenom, String ad, Date dateN) {
    	super(Id,Nom,prenom,ad,dateN);
    	this.dateI=dateI;
    	this.numCarte=numCarte;
    	this.numTel=numTel;
    	listLocation=new ArrayList<Location>();
    	
    }
    public void affichClient() {
    	System.out.println("les informations du clients" +dateI+ numCarte+ numTel+ Id+ Nom+ prenom+ ad+ dateN);
    	
    }
    //Creer une classe Siasie dans laquelle je doit mettre cette methode
   /* public void ajoutClient() {
    	Scanner clav= new Scanner(System.in);
    	System.out.println("Saisie l'identifiant du client");
    	Id= clav.nextInt();
    	System.out.println("Saisie le Nom");
    	Nom= clav.nextLine();
    	System.out.println("Saisie le Prenom");
    	prenom= clav.nextLine();
    	System.out.println("Saisie la Date de Naissance");
    	dateN= clav.nextDate();//// Comment saisir un Type Date //
    	System.out.println("Saisie le Numero de Téléphone");
    	numTel= clav.nextLong();
    	
    }*/

    /**
     * 
     */
    public Date dateI;

    /**
     * 
     */
    public long numCarte;

    /**
     * 
     */
    public long numTel;

    /**
     * 
     */
    public Licence lice;

    /**
     * 
     */
    public ArrayList<Location> listLocation;
    

}