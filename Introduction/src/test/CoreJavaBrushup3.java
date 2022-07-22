package test;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Venkata Mahesh Babu Gadamsetty";
		//String s1="Venkata Mahesh Babu Gadamsetty";
		String s3="Hello";
		
		String s4= new String("Welcome");
		String s5= new String("Welcome");
		
		String[] splittedString=s.split("Babu");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[2].trim());
		//System.out.println(splittedString[3].trim());
		/*for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}*/
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		}
		

	}

