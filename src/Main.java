import java.text.ParseException;
import java.util.*;

import controler.ClientController;
import controler.EmployerController;
import controler.LocationController;
import controler.ParcController;
import controler.ScooterController;
import models.Clients;
import models.Employer;
import models.Location;
import models.Marque;
import models.Model;
import models.Parc;
import models.Personnes;
import models.Scooter;
import tools.DateTools;
public class Main {
	
	
	private static void displayMenu() {
		System.out.println("\n*********Menu******\n");
		System.out.println("1. Louer un scooter");
		System.out.println("2. Retourner d'un scooter");
		System.out.println("3. Etat d'un scooter");
		System.out.println("4. Affichage de letat du parc de scooters");
		System.out.println("5. Saisie du parc des scooter");
		System.out.println("0. Quiiter le programme");
		System.out.print("Votre Choix: ");
	}

	
	
	
	public static void main(String[] args) {
		
		ClientController clientControler = new ClientController();
		ScooterController scooterController= new ScooterController();
		EmployerController employerController= new EmployerController();
		LocationController locationController = new LocationController();
		ParcController parcController = new ParcController();
		DateTools dt = new DateTools();
		
		Marque marque = new Marque("Peugeot");
		Model modelScooter = new Model("Tmax 700",70);
		Scooter scooter1 = new Scooter(1, 100, true, modelScooter, marque);
		scooterController.addScoot(scooter1);
		
		Date birthdayC = new DateTools(25, 05, 2000).getDate();
		Clients client1 = new Clients(1, "404 2000 42424242", "01 01 01 01 01", "Knate", "Mamadou", "1 Rue FM 91000 Evry", birthdayC);
		clientControler.addClient(client1);
		
		Date birthdayE= new DateTools(10, 01, 1998).getDate();
		Employer employer1 = new Employer(1, new Date() , "Employer", 1300, "Keita", "Kasim", " 36 Bd FM 91000 EVRY", birthdayE);
		employerController.addEmployer(employer1);
		
		Parc parc= new Parc(1, "LouScoot");
		parc.setNbScoot(scooterController.listScooter.size());
		parc.setListScooter(scooterController.getListScoote());
		
		boolean showAgin = true;
		while (showAgin) {
			displayMenu();
			
			int choice = new Scanner(System.in).nextInt();
			int clv;
			
			switch (choice) {
				case 1:
					System.out.println("1- Louer---- ");
					System.out.println("Saisie l'Id du Scooter: ");
					clv=new Scanner(System.in).nextInt();
					
					
					Scooter scoot = new Scooter();
					
					scoot = scooterController.findById(clv);
					if(scoot==null) {
						System.out.println("Erreur: Le scooter id "+clv+" n'est pas trouve");
						break;
					}
					
					if(scoot.getEtat()==false) {
						System.out.println("Erreur: Le scooter id "+clv+" déjà en location");
						break;
					}
					
					System.out.println("Saisie l'Id du Client: ");
					clv=new Scanner(System.in).nextInt();
					
					Clients clt = clientControler.findById(clv);
					while(clt==null) {
						System.out.println("Erreur: Le client id "+clv+" n'est pas trouve");
						System.out.println("Ressaisie l'Id du Client ou 0 pour quitter: ");
						clv=new Scanner(System.in).nextInt();
						if(clv==0) {
							System.out.println("Byeeeeeee!");
							System.exit(0);
						}
						clt = clientControler.findById(clv);
						
					}
					
					System.out.println("Saisie le Num contrat: ");
					clv=new Scanner(System.in).nextInt();
					
					System.out.println("Saisie la de retour jj/mm/yyyy: ");
					String d =new Scanner(System.in).nextLine();
					
					try {
						Date dd = dt.formatDate(d);
					}catch (ParseException e) {
						System.out.println("Erreur de convertion de date");
					}
					
					
					System.out.println("Saisie le Km actuel: ");
					int km =new Scanner(System.in).nextInt();
					
					System.out.println("Saisie le prix/km: ");
					int prix =new Scanner(System.in).nextInt();
					
					try {
						Location location = new Location(clv, new Date(), dt.formatDate(d), km, prix);
						scooterController.changeState(scoot.getIdScoot(), false);
						locationController.louer(location);
						System.out.println("Location effectuee avec succes . . . ");
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println("Erreur de convertion de date");
					}
					
					break;
					
					
				case 2:
					
					System.out.println("2- Retour---- ");
					System.out.println("Saisie l'Id du Scooter a retournee: ");
					clv=new Scanner(System.in).nextInt();
					
					scoot = new Scooter();
					
					scoot = scooterController.findById(clv);
					
					while(scoot==null || scoot.getEtat()==true) {
						System.out.println("Erreur: Le scooter id "+clv+" n'est pas actuellement en location ou n'existe pas");
						System.out.println("Ressaisie l'Id du Scooter a retournee ou 0 pour quitter: ");
						clv=new Scanner(System.in).nextInt();
						if(clv==0) {
							System.out.println("Byeeeeeee!");
							System.exit(0);
						}
						scoot = scooterController.findById(clv);
					}
					
					//Numero contrat pour restituer la location et mettre isreturn à true
					System.out.println("Saisie le numero de contrat de la location: ");
					clv=new Scanner(System.in).nextInt();
					
					Location location = new Location();
					location = locationController.findByIdLocation(clv);
					
					while(location == null) {
						System.out.println("Erreur: La location numero "+clv+" n'est pas trouvee");
						System.out.println("Ressaisie le num de contrat ou 0 pour quitter: ");
						clv=new Scanner(System.in).nextInt();
						if(clv==0) {
							System.out.println("Byeeeeeee!");
							System.exit(0);
						}
						location = locationController.findByIdLocation(clv);
					}
					
					//Calculer la difference de km de la location, calculer le montant a payer
					System.out.println("Saisie le Km effectuer (km avant: "+location.getKiloAv()+"): ");
					km=new Scanner(System.in).nextInt();
					
					locationController.retourner(location.getNumContrat(), km);
					
					//On va mettre a jour l'etat du scooter et son km
					scooterController.changeState(scoot.getIdScoot(), true);
					scoot.setKilometre(km);
					scooterController.modifScooter(scoot);
					
					// afficher montant a payer
					System.out.println("Restitution effectuee avec succes... ");
					
					System.out.println("Montant a payer: "+locationController.findByIdLocation(location.getNumContrat()).getMontantAPayer() +" €");
					
					
					break;
				case 3:
					System.out.println("1- Etat du Scooter---- ");
					System.out.println("Saisie l'Id du Scooter dont vous souhaitez connaitre l'etat: ");
					clv=new Scanner(System.in).nextInt();
					scoot= scooterController.findById(clv);
					if(scoot==null) {
						System.out.println("Erreur: Le scooter id "+clv+" n'est pas trouve");
						break;
					}
					
					System.out.println("--Etat du scooter");
					System.out.println("---ID: "+scoot.getIdScoot());
					System.out.println("---Model : Nom = "+(scoot.getMscooter()).nomModel+ " Puis = "+(scoot.getMscooter()).puissance+" ch");
					System.out.println("---Km : "+scoot.getKilometre());
					System.out.println("---Etat: "+((scoot.getEtat()==true)?"Libre":"Loué"));
					
					break;
					
				case 4:
					System.out.println("--Affichage parc");
					System.out.println("----List scoot:");
					
					parc.getListScooter().forEach(sc->{
						System.out.println("++++++ ID: "+sc.getIdScoot());
						System.out.println("++++++ Model : Nom = "+(sc.getMscooter()).nomModel
													+ " Puis = "+(sc.getMscooter()).puissance+" ch");
						System.out.println("++++++ Km : "+sc.getKilometre());
						System.out.println("++++++ Etat: "+((sc.getEtat()==true)?"Libre":"Loué"));
					});
					break;
					
				case 5:
					System.out.println("RESUME DU PARC");
					System.out.println("---Nom: "+parc.getNom_parc());
					System.out.println("---Nb scoot total: "+parc.getNbScoot());
					System.out.println("---Nb Scoot en location: "+locationController.getSumLoccationEncours());
					System.out.println("---Nb client: "+clientControler.getNbClient());
					System.out.println("---Nb Employe: "+employerController.getNbEmploye());
					
					
					break;
					
				case 0:
					System.out.println("Byeeeeeee!");
					System.exit(0);
					break;
					
				default:
					System.out.print("Mauvais Choix entrer votre 1...5 \n");
					break;
				}
			}
			
		}
		

}
