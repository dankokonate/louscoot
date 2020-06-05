package controler;

import java.util.ArrayList;
import java.util.Date;

import models.Location;
import models.Scooter;

public class LocationController {
	
	private static ArrayList<Location> listLocation;
	private ScooterController scooterController;
	
	public LocationController() {
		listLocation = new ArrayList<Location>();
		this.scooterController = new ScooterController();
	}
	
	public Location retourner(int numContrat, int km) {
		Location location = new Location();
		
		for (int i=0; i<listLocation.size(); i++) {
			if(listLocation.get(i).getNumContrat()==numContrat) {
				location = listLocation.get(i);
				
				location.isreturned = true;
				location.setDateRe(new Date());
				location.setKiloAp(km);
				
				//this.changeEtatScoot(location, true);
				
				listLocation.set(i, location);
				
				return location;
			}
			
		}
		
		return null;
	}
	
	public Location louer(Location location) {
		//this.changeEtatScoot(location, false);
		listLocation.add(location);
		return location;
	}
	
	public void changeEtatScoot(Location location, boolean etat) {
		Scooter scooter = new Scooter();
		scooter = location.getScooterlocation();
				
		for (int i=0; i<scooterController.listScooter.size(); i++) {
			if(scooterController.listScooter.get(i).getIdScoot()==scooter.getIdScoot()) {
				scooter = scooterController.listScooter.get(i);
				scooter.setEtat(etat);
				
				scooterController.listScooter.set(i, scooter);
			}
		}
	}
	
	public int getSumLoccationEncours() {
		int sum = 0;
		for (int i=0; i<listLocation.size(); i++) {
			if(listLocation.get(i).isreturned ==false) {
				sum=sum+1;
			}
		}
		return sum;
	}
	
	public Location findByIdLocation(int numContrat) {
		Location location= new Location();
		
		for (int i=0; i<listLocation.size(); i++) {
			if(listLocation.get(i).getNumContrat()==numContrat) {
				location = listLocation.get(i);
			}
		}
		 return location.getNumContrat()==0?null:location;
	}
	
	public Location modifLocation(Location location) throws Exception {
		
		for (int i=0; i<listLocation.size(); i++) {
			if(listLocation.get(i).getNumContrat()==location.getNumContrat()) {
				listLocation.set(i, location);
				return location;
			}
		}
		return null;
	}
	
	
	
	

}
