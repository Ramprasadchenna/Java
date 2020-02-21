package sample;

public class FullName {
	public static void main(String[] args) {
		try {
			int length=args[0].length()+args[1].length();
			if(length<10)
				return;
			System.out.println("Name length should be less than 20 in total");
		}
		catch(ArrayIndexOutfBoundsException e) {
			System.out.println("two command line arguements required");
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
