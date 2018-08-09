package PolymorphismDemo;


/*
 * Polymorphism mewnas one thing in multiple forms.Examples are
 * Add()
 * Add(int a)
 * Add (int a,int b)
 * 
 * There are 2 types of polymorphism. One is compile time and Run time.
 * 
 * To understand compile time polymorphism we need to understand method overloading (also known as Early binding)
 * To understand run time polymorphism we need to understand method overridding (also known as Early binding)
 * 
 * Methods can be overloaded if the have the same name but different signature(No. of Argument, type of argument, order of argument)
 */

public class Polymorphism {
	
	public static void main(String[] args)
	{
		Polymorphism p = new Polymorphism();
		p.add(10, 15);
		p.add(25, 30, 35);
	}

	 public void add(int a,int b)
	 {
		 int c= a+b;
		 System.out.println("Addition is " + c);
	 }
	 
	 public void add(int a,int b,int d)
	 {
		 int c= a+b+d;
		 System.out.println("Addition is " + c);
	 }
}
