package Date;
import java.util.*;
import java.text.*;
import java.time.LocalDate;

public class findDay {

    static String findTheDay(int day,int month,int year) {
    	
    	Calendar gt = Calendar.getInstance();
    	gt.set(year, month, day);
    	int d = gt.DAY_OF_WEEK;
    	SimpleDateFormat ft = new SimpleDateFormat("EEEE");
    	String res = ft.format(d);
    	System.out.println(res.toUpperCase());
    	
    	LocalDate dt = LocalDate.of(year, month, day);
    	return dt.getDayOfWeek().toString();
    }
    public static void main(String[] args)  {
          int day = 24;
          int month =  6;
          int year = 1999;
          System.out.println(findTheDay(day,month,year));
    }
}   