package tools;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
	private int j;
	private int m;
	private int a;
	public DateTools() {
		
	}
	
	public DateTools(int j, int m, int a) {
		this.j=j;
		this.m=m;
		this.a=a;
	}
	
	public boolean after(Date dateLoc) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean before(Date dateRe) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Date formatDate(String dateString) throws ParseException {
		return new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
	}
	

}
