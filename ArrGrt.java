package sample;

import java.util.*;
public class ArrGrt {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		
		
		for (int i=1;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int gr=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>gr)
			{
				gr=arr[i];
			}
		}
		System.out.println(gr);
	}
	

}
