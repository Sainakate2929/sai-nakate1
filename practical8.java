	class animal{
	public void print1(){
	System.out.println("this is animal class !");
	}
	}
	class cat extends animal {
	public void print2(){
	System.out.println("this cat class ");
	}
	}
	class dog extends cat{
	public void print3(){
	System.out.println("this is dog class");
	}
	}

public class practical8 {
	public static void main(String args[]){
	dog ob1 = new dog();
	ob1.print1();
	ob1.print3();
	}
}