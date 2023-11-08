package Demo;


class parents
{
	
	parents(int num)
	{
		System.out.println("Parents class parameterizes");
	}
}

class child extends parents
{
	child()
	{
		super(10);
		System.out.println("child class constructor");
	}
	child(int num)
	{
		super(11);
		System.out.println("child class parametrizd");
	}
}

public class Day4_4
{
	public static void main(String [] args)
	{
		parents ref=new child(11);
	}
}
