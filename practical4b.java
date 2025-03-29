public class practical4b{
	public static void main(String[] args){
	StringBuffer sb = new StringBuffer("Hello ");

	sb.append("World");
	System.out.println("After append:  "+ " " +sb);

	sb.insert(5, " java");
	System.out.println("after insert:  "+ " " +sb);

	sb.replace(6 , 10," world ");
	System.out.println("after replace:  "+ " " +sb);

	sb.reverse();
	System.out.println("after reverse:  "+" " +sb);
	
}	
	}