package sample;
interface R
{
	void met1();
}
interface F extends R
{
	void met2();
	void met3();
}
class X implements F
{
	public void met1()
	{
		System.out.println("one");
	}
	public void met2()
	{
		System.out.println("two");
	}
	public void met3() {
	System.out.println("three");	
	}

void disp()
{
	System.out.println("X");
}
}
public class Inface {
	public void main(String[] args)
	{
		X a=new X();
		a.met1();
		a.met2();
		a.met3();
		a.disp();
	}

}
