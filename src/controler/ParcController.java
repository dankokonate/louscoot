package controler;

import java.util.ArrayList;

import models.Clients;
import models.Employer;
import models.Parc;
import models.Scooter;

public class ParcController {
	private static ArrayList<Employer> listEmployer ;
	private static ArrayList<Scooter> listScooters;
	private static ArrayList<Clients> listClients;
	
	public ParcController() {
		listEmployer=new ArrayList<Employer>();
	}
	
	public void affichEmployer() {
		for (int i=0; i<listEmployer.size(); i++) {
			System.out.print(i+1+": "+listEmployer.get(i).toString()+"\n");
		} 
	}
	
	public void affichClient() {
		for (int i=0; i<listClients.size(); i++) {
			System.out.print(i+1+": "+listClients.get(i).toString()+"\n");
		} 
	}
	
	public void affichScoot() {
		for (int i=0; i<listScooters.size(); i++) {
			System.out.print(i+1+": "+listScooters.get(i).toString()+"\n");
		} 
	}
	
	/*public ArrayList<Scooter> addListScooter(Parc parc, ArrayList<Scooter> ls) {
		returnparc.setListScooter(ls);
		
		return null;
	}*/
}
