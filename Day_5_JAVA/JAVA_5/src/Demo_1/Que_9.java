package Demo_1;


interface Vehicle
{
	 void start1();
}
class Twowheeler implements Vehicle
{
	public void start1()
	{
		System.out.println("we are riding from two wheeler");
	}	
}
class Threewheeler implements Vehicle
{
	public void start1()
	{
		System.out.println("we are riding three wheeler");
	}
}

class Fourwheeler implements Vehicle
{
	public void start1()
	{
		System.out.println("we are riding for wheeler");
	}
}

public class Que_9
{
	static void perform(Vehicle ref)
	{
		ref.start1();
	}
	
	public static void main(String[] args)
	{
		Que_9.perform(new Threewheeler());
	}
}