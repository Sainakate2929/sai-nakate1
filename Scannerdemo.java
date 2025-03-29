import java.util.Scanner;
class Scannerdemo
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String name = scanner.nextLine();

		System.out.println("Enter Age :");
		int age = scanner.nextInt();

		System.out.println("Enter Percentage :");
		double percentage = scanner.nextDouble();

		System.out.println("Enter isStudent? :");
		boolean isstudent = scanner.nextBoolean();


		System.out.println("Name :"+name);
		System.out.println("Age : "+age);
		System.out.println("Percentage :"+percentage);
		System.out.println("Is Student Pass or Fail :"+isstudent);

		scanner.close();

	}


}