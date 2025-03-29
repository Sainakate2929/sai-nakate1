interface Myinterface
{
	public void method1();
}

class interfacedemo
{
	static void method2()
	{
		Myinterface obj1=new Myinterface()
		{
			public void method1()
			{
				System.out.println("\nwrite body option-1");
			};
		};

		Myinterface obj2=new Myinterface()
		{
			public void method1()
			{
				System.out.println("\nwrite body option-2");
			};
		};
		obj1.method1();
		obj2.method1();
	}
	
	public static void main(String args[])
	{
		System.out.println("\nMain starts");
		method2();
		System.out.println("\nMain ends");
	}

}