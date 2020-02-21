package sample;
import java.util.*;
public class NumberValidation {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    if(s1.matches("[0-9]{3}[-]{1}[1-9]{3}[-]{1}[5-8]{5}")) {
    	System.out.println("true");
    	
    }
    else {
    	System.out.println("false");
    }
	}

}
