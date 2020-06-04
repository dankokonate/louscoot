import java.text.ParseException;
import java.util.*;

import controler.ClientController;
import models.Clients;
import models.Personnes;
import models.Scooter;
import tools.DateTools;
public class Main {
	
	private static void displayMenu() {
		System.out.println("\n*********Menu******\n");
		System.out.println("1. Saisie client");
		System.out.println("2. List clients");
		System.out.println("3. Rechercher client");
		System.out.println("4. Modifier client");
		System.out.println("5. Supprimer client");
		System.out.println("0. Quiiter le programme");
		System.out.print("Votre Choix: ");
	}
	
	
	
	public static void main(String[] args) {
		
		ClientController clientControler = new ClientController();
		Scooter scooter= new Scooter();
		DateTools dt = new DateTools();
		/*DateTools dTools = new DateTools();
		ClientController clientControler = new ClientController();
		clientControler.affichClient();
		Clients clients = new Clients();
		clients.addClient(new Clients(6, "012545802", "01-08-09-07-05", "dadak", "kokon", "153 rue Bmad", dTools.formatDate("01/01/2000")));
		*/
		
		boolean showAgin = true;
		while (showAgin) {
			displayMenu();
			
			int choice = new Scanner(System.in).nextInt();
			
			switch (choice) {
				case 1:
					Clients client = new Clients();
					System.out.println("Entrer son nom: ");
					Scanner cv = new Scanner(System.in);
					client.setNom(cv.nextLine());
					
					
					clientControler.addClient(client);
					break;
					
					
				case 2:
					System.out.println("Entrer Id du Scooter:");
					Scanner clav=new Scanner(System.in);
					int id=clav.nextInt();
					if(scooter.FindById(id)==null) {
						//erreur a signaler et return
						System.out.println("ERREUR");
					}else {
						System.out.println("Date debut (dd/mm/yyyy): ");
						String d= clav.nextLine();
						
						Date dateDebut = new Date();
						try {
							dateDebut = dt.formatDate(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						System.out.println("Date de fin (dd/mm/yyyy): ");
						d= clav.nextLine();
						
						Date dateFin = new Date(); 
						try {
							dateFin= dt.formatDate(d); 
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						if(scooter.disponible(dateDebut, dateFin) == false) {
							System.out.println("Déjà en Location");
						}else 
							System.out.println("Saisie le Numero du Contrat");
							int C= clav.nextInt();
							
							System.out.println(" Saisie la Date debut (dd/mm/yyyy): ");
							String dd= clav.nextLine();
							
							Date dateDebutLoc = new Date();
							try {
								dateDebutLoc = dt.formatDate(d);
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							System.out.println("Saisie la Date de fin (dd/mm/yyyy): ");
							d= clav.nextLine();
							
							Date dateFinLoc = new Date(); 
							try {
								dateFinLoc= dt.formatDate(d); 
							} catch (ParseException e) {
								e.printStackTrace();
							}
			
					}
									
						
					
				case 0:
					System.out.println("Byeeeeeee!");
					System.exit(0);
					
				default:
					System.out.print("Mauvais Choix entrer votre 1...5 \n");
					break;
				}
			}
			
		}
		

}
