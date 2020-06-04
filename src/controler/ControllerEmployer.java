package controler;

import java.util.ArrayList;

import models.Clients;
import models.Employer;
import tools.DataBase;

public class ControllerEmployer {
	
	private ArrayList<Employer> listEmployer ;
	
	public ControllerEmployer() {
		this.listEmployer=new ArrayList<Employer>();
	}
		
	

	public Employer addEmployer(Employer employer) {
		
		/*DataBase.employerDB.put(employer.getIdEmployer(),employer);
		return employer;*/
		
		listEmployer.add(employer);
		return employer;
	}
	
	
	public void affichEmployer() {
		/*DataBase.employerDB.entrySet().forEach(e->{
			System.out.println(e.toString()+"\n");
		});*/
		
		for (int i=0; i<listEmployer.size(); i++) {
			System.out.print(listEmployer.get(i));
		}
	}
	
	public Employer findByIdEmployer(int id) {
		Employer employer = new Employer();
		/*if(DataBase.employerDB.containsKey(id))
			employer=DataBase.employerDB.get(id);
		else employer= null;
		return employer;*/
		
		for (int i=0; i<listEmployer.size(); i++) {
			if(listEmployer.get(i).getIdEmployer()==id) {
				employer = listEmployer.get(id);
			}
		}
		 return employer.getIdEmployer()==0?null:employer;
	}
	
	public boolean suppEmployer(int id)  {
		/*if(DataBase.employerDB.containsKey(id)) DataBase.employerDB.remove(id);
		else throw new Exception("Employer non trouver");*/
		
		for (int i=0; i<listEmployer.size(); i++) {
			if(listEmployer.get(i).getIdEmployer()==id) {
				listEmployer.remove(id);
				return true;
			}
		}
		return false;
		
	}
	
	public Employer modifEmployer(Employer employer) throws Exception {
		/*Employer emp = findByIdEmployer(employer.getIdEmployer());
		if(emp!=null) {
			DataBase.employerDB.replace(emp.IdEmployer, employer);
		}else throw new Exception("Employer non trouver");*/
		
		for (int i=0; i<listEmployer.size(); i++) {
			if(listEmployer.get(i).getIdEmployer()==employer.getIdEmployer()) {
				listEmployer.set(i, employer);
				return employer;
			}
		}
		return null;
	}

}