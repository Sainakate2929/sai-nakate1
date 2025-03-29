import java.io.*;

class throws
{
	public static void main(String args[]) throws IOException
	{
		int a;
		System.out.println("Main Starts");
		DataInputStream dls=new DataInputStream(System.in);
		System.out.println("Enter Two Ingeters :");
		a=Integer.parseInt(dls.readLine());
		System.out.println("A :"+a);
		System.out.println("Main Ends");
	}


}