package sample;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Time {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		//defaultformat
		System.out.println("Default format of LocalDate="+date);
		//specificformat
		System.out.println("Pattern"+date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
		LocalTime lt=LocalTime.now();
		System.out.println("Time:"+lt);
		LocalDateTime dateTime= LocalDateTime.now();
		//defaultformat
		System.out.println("Default format of LocalDateTime"+dateTime);
		//specificformat
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));


	}

}
