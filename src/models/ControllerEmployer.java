package models;

import tools.DataBase;

public class ControllerEmployer {
	

	public Employer addEmployer(Employer employer) {
		DataBase.employerDB.put(employer.getIdEmployer(),employer);
		return employer;
	}
	
	public void affichEmployer() {
		DataBase.employerDB.entrySet().forEach(e->{
			System.out.println(e.toString()+"\n");
		});
	}
	
	public Employer findByIdEmployer(int id) {
		Employer employer = new Employer();
		if(DataBase.employerDB.containsKey(id))
			employer=DataBase.employerDB.get(id);
		else employer= null;
		return employer;
	}
	
	public void suppEmployer(int id) throws Exception {
		if(DataBase.employerDB.containsKey(id)) DataBase.employerDB.remove(id);
		else throw new Exception("Employer non trouver");
	}
	
	public void modifEmployer(Employer employer) throws Exception {
		Employer emp = findByIdEmployer(employer.getIdEmployer());
		if(emp!=null) {
			DataBase.employerDB.replace(emp.IdEmployer, employer);
		}else throw new Exception("Employer non trouver");
	}

}