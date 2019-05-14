import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaDateandTime {

	public static void main(String[] args){
	   /*  Scanner input=new Scanner(System.in);
	     System.out.println("Enter date(1-31):");
	     int dd=input.nextInt();
	     System.out.println("Enter month(1-12): ");
	     int month=input.nextInt()-1;
	     System.out.println("Enter year: ");
	     int year=input.nextInt();
	   Date date= (new GregorianCalendar(year, month, dd)).getTime();
	   SimpleDateFormat f = new SimpleDateFormat("EEEE");
	     String day=f.format(date);
	     System.out.println(day);
	     */
		 Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        Solution sl=new Solution();
	        System.out.println(sl.getDay(day, month, year));
	     }

}
 class Solution {
    public static String getDay(String day, String month, String year) {
        int d=Integer.parseInt(day);
        int m=Integer.parseInt(month)-1;
        int y=Integer.parseInt(year);
        Date date= (new GregorianCalendar(y, m, d)).getTime();
	   SimpleDateFormat f = new SimpleDateFormat("EEEE");
	     String da=f.format(date);
         return da;
       
    }
    }
