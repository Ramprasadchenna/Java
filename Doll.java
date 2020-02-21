package elite;

import java.util.Scanner;

public class Doll extends Thread{

	public void run() {
		while(true) {
			try {
				System.out.println("Hava a nice day");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				break;
			}
		
		}
	}
	public static void main(String[] args) {
	Doll d=new Doll();
	d.start();
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	if(s!=null) d.interrupt();
	}
	}

