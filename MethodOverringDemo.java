class A
{
	public void display()
	{		
		System.out.println("Display method of super class A");
	}
}

class B extends A
{
	@Override
	public void display()
	{
		System.out.println("Display method of sub class B");
	}

	public  void calling()
	{
		System.out.println("direct calling diplay() method of sub class");
		display();

		System.out.println("calling display method of super class");
		super.display();
	}
}

class MethodOverringDemo
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.calling();
		b1.display();
		
	}
} 