package test;

public class MethodsLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsLearn l=new MethodsLearn();
		//l.getdata();
		String name=l.getData();
		System.out.println(name);
		MethodsLearn2 l1=new MethodsLearn2();
		l1.getUserData();
		String firstname=l1.getUserData();
		System.out.println(firstname);
		getData2();
		String slogan=getData2();
		System.out.println(slogan);

	}

	public String getData()
	{
		System.out.println("Hello World!");
		return "Mahesh Babu";
	}
	
	public static String getData2()
	{
		System.out.println("Hello wonderful people");
		return "Good Morning";
	}
	}

