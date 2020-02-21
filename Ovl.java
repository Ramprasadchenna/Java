package sample;

class Ovl {
	void display()
	{
		System.out.println("hello");
	}
	void display()
	{
		System.out.println("world");
	}

}
class exec
{
	public static void main(String[] args)
	{
		Ovl obj1=new Ovl();
		obj1.disp();
	}
}
