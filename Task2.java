package Task2;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LocalDate date = LocalDate.now();
		addDays(date);
		
		}

	public static void addDays(LocalDate date2)throws ParseException  {
		/* int addingyears = 100;
		int addingmonths = 12;
		int addingdays = 25;

		int years = date2.getYear();
		int months = date2.getMonthValue();
		int days = date2.getDayOfYear();
		
		 
	/*	int newyears = years + addingyears;
		 int newmonths = months+addingmonths;
		 int newdays = days+addingdays;
		 date2.withDayOfYear(newyears);   

		System.out.println(days);
		GregorianCalendar cln = new GregorianCalendar();
		//  System.out.println(cln.toString());
		System.out.println(cln.get(Calendar.LONG_FORMAT));
		cln.add(Calendar.MONTH, addingmonths);
		
		System.out.println(cln.get(Calendar.MONTH));
		System.out.println(cln.get(Calendar.DAY_OF_MONTH));
		
		Date currentDate = new Date();
		System.out.println(currentDate);	
		
		long time = currentDate.getTime();
		System.out.println(time);
		Timestamp timeStamp = new Timestamp(time);
		
		System.out.println(timeStamp);				*/
				
		
		
		Date currentDate = new Date(1);
		System.out.println(currentDate);
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	/*Date date = df.parse(30-01-2017);
		
	/*System.out.println(date.getMonth());
		
		GregorianCalendar cln = new GregorianCalendar();
		System.out.println(cln);
		
		System.out.println(cln.get(Calendar.MONTH));
		
		cln.add(Calendar.MONTH, 7);
		System.out.println(cln.get(Calendar.MONTH));
		System.out.println(cln.get(Calendar.DAY_OF_MONTH));
		
		long time = currentDate.getTime();
		System.out.println(time);
//		Timestamp timeStamp = new Timestamp(time);
		
	System.out.println(timeStamp);		*/

	}
}
