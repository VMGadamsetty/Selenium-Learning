package test;

public class CoreJavaBrushup {
	public static void main(String[] args) {
		int myNum = 5;
		String website= "Rahulshetty academy";
		char letter = 'C';
		double dec = 4.5;
		boolean myCard = true;
		
		System.out.println(myNum + " is the number stored ");
		int[] arr= new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[2]);
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,122};
		System.out.println(arr2[3]);
		//for loop
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=0;i<arr2.length;i++)
		{   
			System.out.println(arr2[i]);
		}
		String[] name= {"Venkata","Mahesh","Babu","Gadamsetty"};
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		for (String s: name)
		{
			System.out.println(s);
		}
		}
 	}

	


