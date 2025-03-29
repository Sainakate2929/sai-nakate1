class A
{
	public int i,j;
	public void showbase()
	{
		System.out.println("Base Class value of i and j :"+i+" and "+j);
	}


}

class B extends  A
{
	public int k;
	public void showderived()
	{
		System.out.println("Derived Class value of k :"+k);
	}

	public void addall()
	{
		System.out.println("Addition of i+j+k : "+(i+j+k));
	}

}

class SingleIdemo
{
	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B();

		System.out.println("Using object of base class :");
		a1.i=10;
		a1.j=20;
		a1.showbase();

		System.out.println("Using object of derived class :");
		b1.i=50;
		b1.j=100;
		b1.k=150;
		b1.showbase();
		b1.showderived();
		System.out.println("Showing addition of all :");
		b1.addall();
	
	}
}