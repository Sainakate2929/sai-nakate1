import java.util.*;
class practical5e{
	public static void main(String[] args){
	Vector <Integer> V = new Vector<>(3);
	
	V.add(19);
	V.add(20);
	V.add(23);
	V.add(14);
	System.out.println("after adding elements: "+V);

	V.insertElementAt(45,2);
	System.out.println("after inserting elements: "+V);

	V.remove(1);
	System.out.println("after removing elements: "+V);

	System.out.println("is empty: "+V.isEmpty());

	System.out.println("first elements: "+V.firstElement());
	
	System.out.println("last elements: "+V.lastElement());

	
}
}