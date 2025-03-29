import java.util.*;

public class ExceptionSample
{
	public static void main(String args[])
	{
		int a=5;
		int b=10;
		int res=0;
	
		//try
		//{
			res=a/(b-10);
		//}
		//catch(ArithmeticException e)
		//{
			System.out.println("ArithmeticException Caught");
		//}
		//finally
		//{
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("Result="+res);
		//}
	}

}