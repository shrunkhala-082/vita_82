
package Demo;

class parents
{
	void disp(int k)
	{
		System.out.println("display1");
	}
}
class child
{
	void disp()
	{
		System.out.println("display2");
	}
}

public class Day4_8
{
	public static void main(String[] args)
	{
		child w=new child();
		w.disp();
	}
}
