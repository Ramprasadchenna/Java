package elite;

public class Excep {

	public static void main(String[] args) {
		int a=10,b=0;
		
		
		
		
			try {
			System.out.println(a/b);
		}
			catch(Exception e)
			{
			System.out.println(e);
			}
		
	
		catch(ArithmeticException ae) {
		System.out.println(ae);
		}
		
	}
}


