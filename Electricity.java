import java.util.*;
public class Electricity {
	public static int meterReading(String input1, String input2, int input3) {
	    int n1 = Integer.parseInt(input1.substring(5, input1.length()));
	    int n2 = Integer.parseInt(input2.substring(5, input2.length()));
	    int n = ((n2 - n1) * input3);
	    return n;
	  }
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    String s2 = sc.nextLine();
	    int n = sc.nextInt();
	    int n1 = meterReading(s1, s2, n);
	    System.out.println(n1);
	  }
	}

