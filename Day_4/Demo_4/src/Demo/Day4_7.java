package Demo;

class parents
{
	void disp()
	{
		System.out.println("pareents disp");
	}
}

class child extends parents
{
	void disp()
	{
		System.out.println("child disp");
	}
}

public class Day4_7
{
	public static void main(String[] args)
	{
		child p=new child();
		p.disp();
	}
	
	
}