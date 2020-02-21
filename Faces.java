package sample;
interface T
{
	void met1();
}
interface Q extends T
{
	void met2();
	void met3();
}
class Y implements Q
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
	System.out.println("Y");
}
}
public interface Faces {
	public static void main(String[] args)
	{
		Y a=new Y();
		a.met1();
		a.met2();
		a.met3();
		a.disp();
	}

}
