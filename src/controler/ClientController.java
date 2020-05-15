package controler;

import models.Clients;
import tools.DataBase;
public class ClientController {
	
	
	/**
	 * 
	 * @param client
	 * @return
	 */
	public Clients addClient(Clients client) {
		DataBase.clientDB.put(client.getIdClient(),client);
		return client;
	}
	
	public void affichClient() {   // entrySet= cle 
		DataBase.clientDB.entrySet().forEach(c->{
			System.out.println(c.toString()+"\n");
		});
	}
	
	public Clients findById(int id) {
		/*Clients client = new Clients();
		if(clientDB.containsKey(id))
			client=clientDB.get(id);
		else client= null;*/
		
		return (DataBase.clientDB.containsKey(id))?DataBase.clientDB.get(id):null;
	}
	
	public void suppClient(int id) throws Exception  {
		if(DataBase.clientDB.containsKey(id)) DataBase.clientDB.remove(id);
		else throw new Exception("Client non trouvé");
		
		
	}
	public void modifClients(Clients client ) throws Exception {
		Clients clt = findById(client.getIdClient());
		if( clt!= null) {
			DataBase.clientDB.replace(clt.getIdClient(), client);
		}else {
			throw new Exception("Client non trouvé");
		}
	}
	

}
