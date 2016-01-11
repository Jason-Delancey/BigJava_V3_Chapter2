import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class GregorianCalendarTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("DAY_OF_WEEK: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("AM_PM: " + cal.get(Calendar.AM_PM));
		 System.out.println("HOUR: " + cal.get(Calendar.HOUR));
		 System.out.println();
		 
		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println("YEAR: " + cal.get(Calendar.YEAR));
		System.out.println("MONTH: " + cal.get(Calendar.MONTH));
		System.out.println("DAY_OF_WEEK: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("DATE: " + cal.get(Calendar.DATE));
		System.out.println();

		GregorianCalendar piazzaBirthday = new GregorianCalendar(1968, Calendar.SEPTEMBER, 4);
		System.out.println("YEAR: " + piazzaBirthday.get(Calendar.YEAR));
		System.out.println("MONTH: " + piazzaBirthday.get(Calendar.MONTH));
		System.out.println("DAY_OF_WEEK: " + piazzaBirthday.get(Calendar.DAY_OF_WEEK));
		System.out.println("DATE: " + piazzaBirthday.get(Calendar.DATE));
		System.out.println();

		piazzaBirthday.add(Calendar.DAY_OF_MONTH, 10000);
		System.out.println("YEAR: " + piazzaBirthday.get(Calendar.YEAR));
		System.out.println("MONTH: " + piazzaBirthday.get(Calendar.MONTH));
		System.out.println("DAY_OF_WEEK: " + piazzaBirthday.get(Calendar.DAY_OF_WEEK));
		System.out.println("DATE: " + piazzaBirthday.get(Calendar.DATE));
	}

}
