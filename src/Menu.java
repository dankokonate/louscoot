import java.util.*;

import models.Parc;
import models.Saisie;

public class Menu {
	
	public static void AfficheMenu() {
		Scanner clav= new Scanner(System.in);
		int choix;
		System.out.println("1. Louer un Scooter");
		System.out.println("2. Retour d'un Scooter");
		System.out.println("3. Etat d'un Scooter");
		System.out.println("4. Affichage de l'état du parcc de Scooters");
		System.out.println("5. Saisie du parc des Scooters");
		System.out.println("6. Quiiter le programme");
		System.out.print("Votre Choix: ");
		choix= clav.nextInt();
		if(choix==1) {
			/*Saisie le num idscoot a louer
			 * 
			 */
			boolean IdScoot = true;
			Saisie.SaisieIdScoot();
			/*
			 * condition 
			 * Si le Scoot n'exist pas -> Erreur
			 */
	
			/*
			 * Si il est louer -> deja en location
			 * Sinon -> en Location
			 */
			
		}else if(choix==2){
			/*Saisie le num idscoot a louer
			 */
			Saisie.SaisieIdScoot();
			/*
			 * CONDITION
			 * Si scoot n'exist pas-> erreur
			 * Si scoot marqué comme etant en location -> Stipule ( En location)
			 * Sinon Demande le nbre de kilometrage et rajoute au kilometrage du scoot
			 * Scoot-> disponible
			 * 
			 */
		}else if(choix==3) {
			/*
			 * Saisie IdScoot dont on veux connaitre l'etat
			 */
			Saisie.SaisieIdScoot();
			/*
			 * CONDITION
			 * Si le scoot n'exist pas-> Erreur
			 * Sinon Afficher: son Model, Id, kilometrage, Etat de location
			 */
		}else if(choix==4) {
			System.out.println("Les information sur l'ensemble du Parc: ");
			Parc.AfficheListScoot();//Comment Avoir le model de Scooter//
			
			
		}else if(choix==5) {
			
			
			
		}else if(choix==6) {
			Menu.AfficheMenu();
		}
		
	}
	

}
