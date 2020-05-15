package tools;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;

import javax.swing.text.html.parser.DTD;

import models.Clients;
import models.Employer;
import models.Licence;

public class DataBase {
	
	public static HashMap<Integer,Clients> clientDB;  //
	public static HashMap<Integer,Employer> employerDB; 
	private DateTools dateTools;
	
	public DataBase(DateTools dt) {
		this.dateTools = dt;
		clientDB = new HashMap<Integer, Clients>();
		employerDB = new HashMap<Integer, Employer>();
		try {
			this.loadData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadData() throws ParseException {
		this.setDefaultClients();
		this.setDefaultEmployer();
		
	}
	
	private void setDefaultClients() throws ParseException {
		Clients client1 = new Clients();
		client1.setIdClient(1);
		client1.setNom("Kone");
		client1.setPrenom("Abdou");
		client1.setAd("10 rue FM");
		client1.setDateN(dateTools.formatDate("20/01/2000"));
		client1.setNumTel("01-02-03-04-05");
		client1.setNumCarte("0102030405");
		client1.setLice(new Licence(0, 'B', 5));
		
		Clients client2 = new Clients();
		client2.setIdClient(2);
		client2.setNom("Kane");
		client2.setPrenom("Abdoulaye");
		client2.setAd("10 rue FM");
		client2.setDateN(dateTools.formatDate("20/01/2000"));
		client2.setNumTel("01-02-03-04-05");
		client2.setNumCarte("0102030405");
		client2.setLice(new Licence(0, 'B', 5));
		
		Clients client3 = new Clients();
		client3.setIdClient(3);
		client3.setNom("Kante");
		client3.setPrenom("Abdou");
		client3.setAd("10 rue FM");
		client3.setDateN(dateTools.formatDate("20/01/2000"));
		client3.setNumTel("01-02-03-04-05");
		client3.setNumCarte("0102030405");
		client3.setLice(new Licence(0, 'B', 5));
		
		Clients client4 = new Clients();
		client4.setIdClient(4);
		client4.setNom("Diakité");
		client4.setPrenom("Abdou");
		client4.setAd("10 rue FM");
		client4.setDateN(dateTools.formatDate("20/01/2000"));
		client4.setNumTel("01-02-03-04-05");
		client4.setNumCarte("0102030405");
		client4.setLice(new Licence(0, 'B', 5));
		
		Clients client5 = new Clients();
		client5.setIdClient(5);
		client5.setNom("Coulibaly");
		client5.setPrenom("Abdou");
		client5.setAd("10 rue FM");
		client5.setDateN(dateTools.formatDate("20/01/2000"));
		client5.setNumTel("01-02-03-04-05");
		client5.setNumCarte("0102030405");
		client5.setLice(new Licence(0, 'B', 5));;
		
		clientDB.put(client1.getIdClient(), client1);
		clientDB.put(client2.getIdClient(), client1);
		clientDB.put(client3.getIdClient(), client1);
		clientDB.put(client4.getIdClient(), client1);
		clientDB.put(client5.getIdClient(), client1);
	}
	
	private void setDefaultEmployer() throws ParseException {
		Employer employer1= new Employer(1, dateTools.formatDate("10/03/2000"), "Employer", 1500, "Aaa", "bbb", "13 bd Fm 91000 Evry", dateTools.formatDate("10/03/2000"));
		Employer employer2= new Employer(1, dateTools.formatDate("10/03/2000"), "Employer", 1500, "Cc", "bbb", "13 bd Fm 91000 Evry", dateTools.formatDate("10/03/2000"));
		Employer employer3= new Employer(1, dateTools.formatDate("10/03/2000"), "Employer", 1500, "Aaa", "bbb", "13 bd Fm 91000 Evry", dateTools.formatDate("10/03/2000"));
		Employer employer4= new Employer(1, dateTools.formatDate("10/03/2000"), "Employer", 1500, "Aaa", "bbb", "13 bd Fm 91000 Evry", dateTools.formatDate("10/03/2000"));

		employerDB.put(employer1.getIdEmployer(), employer1);
		employerDB.put(employer2.getIdEmployer(), employer2);
		employerDB.put(employer3.getIdEmployer(), employer3);
		employerDB.put(employer4.getIdEmployer(), employer4);

	}



}
