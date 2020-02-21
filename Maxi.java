package sample;
class O {
	int X=1000;
	O(){
		System.out.println("O");
	}
	class P extends O
	{
		P(){
			System.out.println("P");
		}
	}
}
	 class Maxi {
public static void main(String[] args) {
	P obj=new P();
}
}
	
