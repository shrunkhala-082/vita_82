import java.util.Scanner;
public class Example_16 
{
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int no1=sc.nextInt();

		if(no1%3==0)
			System.out.println(no1+" is divisible by 3");
		else
			System.out.println(no1+" is not divisible by 3");
		sc.close();
	}
}