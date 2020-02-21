package chocky;
import java.util.Arrays;
public class FirstDayAtSchool {
	public boolean res;
	public void checkmyName(String myname)
	{
		if(myname.compareTo("RAM")==0)
				res=true;
		else
			res=false;
	}

	public String[] prepareMyBag() {
		String[] schoolbag= {"Books","Notebooks","Pens"};
		System.out.println("MY Schoolbag CONTAINS:"+Arrays.toString(schoolbag));
		return schoolbag;
		}
	public String[] addPencils() {
		String[] schoolbag = {"Books","Notebooks","Pens","Pencils"};
		System.out.println("Now my school bag contains"+Arrays.toString(schoolbag));
		return schoolbag;
	}
	public static void main(String[]args) {
		FirstDayAtSchool fds = new FirstDayAtSchool();
				String[] sb = fds.prepareMyBag();
		System.out.println(sb);
		for(String s:sb)
			System.out.println("Bag contains:"+s);
		String[] pencil = fds.addPencils();
		for(String s:pencil)
			System.out.println("Pencil box contains"+s);
	}

}
