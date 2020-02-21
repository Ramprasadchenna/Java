package sample;

public class St {
	static int a;
	St(){}
    static void display()
	{
		a++;
		System.out.println(a);
	}
	@SuppressWarnings("rawtype")
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			St se=new St();
					se:display();}
		}
	
	}

