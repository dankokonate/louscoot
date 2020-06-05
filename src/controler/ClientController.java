package controler;

import java.util.ArrayList;

import models.Clients;
import tools.DataBase;
public class ClientController {
	
	private static ArrayList<Clients> listClients;
	
	public ClientController() {
		// TODO Auto-generated constructor stub
		this.listClients = new ArrayList<Clients>();
	}
	
	/**
	 * 
	 * @param client
	 * @return
	 */
	public Clients addClient(Clients client) {
		//DataBase.clientDB.put(client.getIdClient(),client);
		listClients.add(client);
		return client;
	}
	
	public void affichClient() {   // entrySet= cle 
		/*DataBase.clientDB.entrySet().forEach(c->{
			System.out.println(c.toString()+"\n");
		});*/
		for (int i=0; i<listClients.size(); i++) {
			System.out.print(i+1+": "+listClients.get(i).toString()+"\n");
		}
	}
	
	public Clients findById(int id) {
		Clients clients = new Clients();
		
		for (int i=0; i<listClients.size(); i++) {
			if(listClients.get(i).getIdClient()==id) {
				clients = listClients.get(i);
			}
		}
		 return clients.getIdClient()==0?null:clients;
		/*
		listClients.forEach(clt->{
			if(clt.getIdClient() == id) {
				System.out.print(clt.toString());
			}
		});
		System.out.print("N'existe pas");*/
	}
	
	public boolean suppClient(int id)   {
		/*if(DataBase.clientDB.containsKey(id)) DataBase.clientDB.remove(id);
		else throw new Exception("Client non trouvé");
		*/
		for (int i=0; i<listClients.size(); i++) {
			if(listClients.get(i).getIdClient()==id) {
				listClients.remove(i);
				return true;
			}
		}
		return false;
		
	}
	
	public Clients modifClients(Clients client ) {
		/*Clients clt = findById(client.getIdClient());
		if( clt!= null) {
			DataBase.clientDB.replace(clt.getIdClient(), client);
		}else {
			throw new Exception("Client non trouvé");
		}*/
		
		for (int i=0; i<listClients.size(); i++) {
			if(listClients.get(i).getIdClient()==client.getIdClient()) {
				listClients.set(i, client);
				return client;
			}
		}
		return null;
	}
	
	public int getNbClient() {
		return listClients.size();
	}
	

}
