package controler;

import java.util.ArrayList;
import java.util.Date;

import models.Location;
import models.Scooter;

public class ScooterController {
	public static ArrayList<Scooter> listScooter;
	
	public ScooterController() {
		listScooter = new ArrayList<Scooter>();
	}
	
	public Scooter addScoot(Scooter Scoot) {
		listScooter.add(Scoot);
		return Scoot;
	}
	
	public void affichScoot() {
		for (int i=0; i<listScooter.size(); i++) {
			System.out.print(i+1+": "+listScooter.get(i).toString()+"\n");
		}
	}
	
	public Scooter findById(int id) {
		Scooter scooter= new Scooter();
		for (int i=0; i<listScooter.size(); i++) {
			if(listScooter.get(i).getIdScoot()==id) {
				scooter = listScooter.get(i);
			}
		}
		 return scooter.getIdScoot()==0?null:scooter;
	}
	
	public boolean disponible(Scooter scooter, Date deb, Date fin) {
    	boolean disponible= true;
    	for(int i=0; i<scooter.listLocation.size();i++) {
    		Location res =scooter.listLocation.get(i);
    		if((deb.equals(res.dateLoc) && fin.equals(res.dateRe))
    			||(deb.before(res.dateLoc)&&(fin.after(res.dateRe))
    			||(fin.after(res.dateRe)&&(deb.before(res.dateLoc)))))
    				
    		 
    		{
    			disponible=false;
    		}
    		
    	}
    	return disponible;
    }
	
	public boolean suppClient(int id)   {
		for (int i=0; i<listScooter.size(); i++) {
			if(listScooter.get(i).getIdScoot()==id) {
				listScooter.remove(i);
				return true;
			}
		}
		return false;

	}
	
	public Scooter modifScooter(Scooter scooter ) {
		for (int i=0; i<listScooter.size(); i++) {
			if(listScooter.get(i).getIdScoot()==scooter.getIdScoot()) {
				listScooter.set(i, scooter);
				return scooter;
			}
		}
		return null;
	}
	
	public Scooter changeState(int id, boolean etat){
		Scooter scooter = this.findById(id);
		/*if(scooter.getIdScoot() ==0) {
			throw new Exception("Scooter introuvable");
		}*/
		
		scooter.setEtat(etat);
		this.modifScooter(scooter);
		
		return scooter;
	}
	
	public ArrayList<Scooter> getListScoote() {
		return listScooter;
	}
	
}
