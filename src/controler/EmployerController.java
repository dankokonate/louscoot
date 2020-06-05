package controler;

import java.util.ArrayList;
import models.Employer;

public class EmployerController {
	
	private static ArrayList<Employer> listEmployer ;
	
	public EmployerController() {
		listEmployer=new ArrayList<Employer>();
	}
		
	

	public Employer addEmployer(Employer employer) {
		listEmployer.add(employer);
		return employer;
	}
	
	
	public void affichEmployer() {
		for (int i=0; i<listEmployer.size(); i++) {
			System.out.print(i+1+": "+listEmployer.get(i).toString()+"\n");
		}
	}
	
	public Employer findByIdEmployer(int id) {
		Employer employer = new Employer();
		for (int i=0; i<listEmployer.size(); i++) {
			if(listEmployer.get(i).getIdEmployer()==id) {
				employer = listEmployer.get(i);
			}
		}
		 return employer.getIdEmployer()==0?null:employer;
	}
	
	public boolean suppEmployer(int id)  {
		for (int i=0; i<listEmployer.size(); i++) {
			if(listEmployer.get(i).getIdEmployer()==id) {
				listEmployer.remove(i);
				return true;
			}
		}
		return false;
		
	}
	
	public Employer modifEmployer(Employer employer) throws Exception {
		for (int i=0; i<listEmployer.size(); i++) {
			if(listEmployer.get(i).getIdEmployer()==employer.getIdEmployer()) {
				listEmployer.set(i, employer);
				return employer;
			}
		}
		return null;
	}
	
	public int getNbEmploye() {
		return listEmployer.size();
	}

}