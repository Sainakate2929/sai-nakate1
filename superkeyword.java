class A
{
	public A(int x)
	{
		System.out.println("Received "+ x +" superkeywordsuperkeywordsuperkeywordsuperkeywordsuperkeyword from the subclass constructor");
	}
}

class B extends A
{
	public B()
	{
		super(10);
	}
}

class superkeyword
{
	public static void main(String args[])
	{
		System.out.println("calling to constuctor of subclass");
		B b1=new B();
	}
}