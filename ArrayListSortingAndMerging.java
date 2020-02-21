package sample;
import java.util.*;
public class ArrayListSortingAndMerging {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); //create a Scanner object
		ArrayList<Integer> list1=new ArrayList<Integer>(); //create a Arraylist object
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		for(int i=0;i < 5;i++) {
			list1.add(s.nextInt());
		}
		for(int i=0;i<5;i++) {
			list2.add(s.nextInt());
		}
		newlist=sortMergedArraylist(list1,list2);
		for(int i=0;i < 3;i++) {
			System.out.println(newlist.get(i));
			
		}
		
	}
	public static ArrayList<Integer> sortMergedArraylist(ArrayList<Integer>list1,ArrayList<Integer>list2)
	{
		list1.addAll(list2);
		Collections.sort(list1); //we obtain in ascending order
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(list1.get(2));
		ans.add(list1.get(6));
		ans.add(list1.get(9));
		return ans;
	}

}