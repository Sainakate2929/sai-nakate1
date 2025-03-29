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

class hirechicaldemo
{
	public static void main(String args[])
	{
		System.out.println("object of Class A is created");
		A obj1 = new A();
		obj1.showA();
	
		System.out.println("object of Class B is created");
		B obj2 = new B();
		obj2.showA();
		obj2.showB();

		System.out.println("object of Class B is created");
		C obj3 = new C();
		obj3.showA();
		obj3.showC();

	}

}
