import java.util.*;

import controler.ClientController;
import models.Clients;
import models.Personnes;
public class Main {

	public static void main(String[] args) {
		Clients clients= new Clients();
		clients.setNom("hhh");	
		clients.setNumTel("01-50");
		clients.setPrenom("gge");
		clients.setDateI(new Date());
		//clients.setDateN(dateN);		
		
		Personnes personnes = new Personnes();
		ClientController clientController= new ClientController();
		ClientController.addClient(clients);
		ClientController.affichClient();
		

	}

}
