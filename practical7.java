	class institude {
	void print1 (){
	System.out.println("institude name is : KPIT");
	}
	}
	class deparment extends institude {
	void print2(){
	System.out.println("deparment name is :AI");
	}
	}
public class practical7 {
	public static void main(String[] args){
	deparment ob = new deparment();
	ob.print1();
	ob.print2();


}
}

