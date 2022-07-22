package test;

import java.util.ArrayList;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,122};
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i]+"is not a multiple of 2");
			}
		}
		
		ArrayList <String> a= new ArrayList<String>();
		a.add("Venkata");
		a.add("Mahesh");
		a.add("Babu");
		a.add("Gadamsetty");
		System.out.println(a.get(3));

	}

}
