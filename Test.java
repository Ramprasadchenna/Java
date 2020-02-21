package sample;
class Studen
{
	String name;
	Studen(String s)
	{
		name=s;
	}
	String getName()
	{
		return name;
	}
}
public  class Test {

	public static void main(String[] args) {
		Studen s1[]=new Studen[2];
		s1[0]=new Studen("max");
		s1[1]=new Studen("ram");
		for(int i=0;i<s1.length;i++) {
		System.out.println("name:"+s1[i].getName());
	}
}
}
	


