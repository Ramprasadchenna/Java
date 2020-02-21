package sample;

public class string1 {
	public static void main(String ar[])
	{
		String name1="Ramprasad chenna";
		String name2="chocky";
		System.out.println(name1.contentEquals(name2));
		System.out.println(name1.charAt(3));
		System.out.println(name1.concat(name2));
		System.out.println(name1.indexOf('p'));
		System.out.println(name1.lastIndexOf('r'));
		System.out.println(name1.length());
		System.out.println(name1.replace("chenna","rama"));
	}

}
