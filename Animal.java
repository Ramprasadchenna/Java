package sample;

abstract class Animal {
	abstract void eat();
}
class tiger extends Animal
{
	void eat()
	{
		System.out.println("I eat only non veg");
	}
}
class Goat extends Animal
{
	void eat()
	{
		System.out.println("I eat only veg");
	}
}
class test
{
	public static void main(String[] args)
	{
		Animal m;
		m=new tiger();
		m.eat();
		m=new Goat();
		m.eat();
	}

	}
