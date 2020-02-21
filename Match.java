package sample;
import java.text.*;
import java.util.Date;
public class Match {

	public static void main(String[] args) throws ParseException {
		Date now=new Date();
		System.out.println(now);
		SimpleDateFormat ft =
		new SimpleDateFormat("E dd MMM yyyy 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(now));
		ft =new SimpleDateFormat("dd.mm.yyyy");
		Date d=new Date();
		System.out.println(ft.format(d));
		
	}

}
