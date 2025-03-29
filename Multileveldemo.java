class A
{
	A()
	{
		System.out.println("Contsructor of Parent Class A is executed");
	}

	void showA()
	{
		System.out.println("Method of Parent Class A is executed");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Constructor of Chlid1 Class B is executed");
	}

	void showB()
	{
		System.out.println("Method of Child1 Class B is executed ");
	}
}

class C extends A
{
	C()
	{
		System.out.println("Constructor of Chlid2 Class C is executed");
	}

	void showC()
	{
		System.out.println("Method of Child2 Class C is executed ");
	}
}