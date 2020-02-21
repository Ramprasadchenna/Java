package sample;

abstract class creatures {
	abstract void eat();
}
class monkey extends creatures
{
	void eat()
	{
		System.out.println("I eat only non veg");
	}
}
class hen extends creatures
{
	void eat()
	{
		System.out.println("I eat only veg");
	}
}
class Blast
{
	public static void main(String[] args)
	{
		creatures m;
		m=new monkey();
		m.eat();
		m=new hen();
		m.eat();
	}

	}


