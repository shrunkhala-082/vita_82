package Demo;


class parents
{
	
	parents(int num)
	{
		System.out.println("Parents parameterizes");
	}
}

class child1 extends parents
{
	child1()
	{
		super(1);
		System.out.println("child1 constructor");
	}
	child1(int num)
	{
		super(2);
		System.out.println("child1 parameter");
	}
}

class child2 extends parents
{
	
	child2()
	{ 
		super(1);
		System.out.println("child2 constructor");
		
	}
	child2(int num)
	{
		super(2);
		System.out.println("child2parameter");
	}
}

public class Day4_6
{
	public static void main(String [] args)
	{
		parents ref=new child2();
	}
}
