package controler;

import java.util.HashMap;

import models.Clients;
public class ClientController {
	public static HashMap<Integer,Clients> clientDB;
	
	public ClientController() {
		ClientController.clientDB = new HashMap<Integer, Clients>();
	}
	
	/**
	 * 
	 * @param client
	 * @return
	 */
	public static Clients addClient(Clients client) {
		clientDB.put(client.getIdClient(),client);
		return client;
	}
	
	public static void affichClient() {
		clientDB.entrySet().forEach(c->{
			System.out.print(c.toString());	});
	}
	
	

}
