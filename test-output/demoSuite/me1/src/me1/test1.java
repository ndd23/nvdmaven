package me1;

public class test1 {
	int a=30;
	static int b= 60;
	public void m1 ()
	{
		System.out.println("i am method m1");
	}
	public static void  m2 ()
	{ 
		System.out.println("i am method m2");
		
	}
	public static void Addition (int a,int b) {
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(test1.b );
		test1.m2();
		test1 test = new test1();
		System.out.println(test.a);
		test.m1();
		test1.Addition(30,60);
		test1.Addition(50,60);

	}

}
