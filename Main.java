package sample;
import java.util.Scanner;
public class Main {
	static int checkSum(int sum)
	{
		if(sum%2 != 0) {
			return -1;
		}
		else {
			return 1;
		}
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int sum=0;
	while(n>0) {
		int rem = n%10;
		if(rem%2 != 0) {
			sum = sum+rem;
			
		}
		n=n/10;
	}
	checkSum(sum);
	if(sum%2==0) 
		System.out.println("sum of odd digits is even");
		else {
			System.out.println("sum of odd digits is odd");
		}
		
	}
}

