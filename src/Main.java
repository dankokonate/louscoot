import java.util.*;

import controler.ClientController;
import models.Clients;
import models.Personnes;
import tools.DateTools;
public class Main {

	public static void main(String[] args) {
		DateTools dTools = new DateTools();
		ClientController clientControler = new ClientController();
		clientControler.affichClient();
		Clients clients = new Clients();
		clients.addClient(new Clients(6, "012545802", "01-08-09-07-05", "dadak", "kokon", "153 rue Bmad", dTools.formatDate("01/01/2000")));
		
	}

}
