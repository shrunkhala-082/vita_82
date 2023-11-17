package Demo_1;

class base1
{
	int num;
	public base1(int num)
	{
		this.num=num;
	}
}
class sub1 extends base1
{
	
	public sub1()
	{    super(1);
		System.out.println("default constructor");
	}
	public sub1(int num)
	{   super(10);
		System.out.println("parameter constructor");
	}
	public sub1(int k,int y)
	{
		super(20);
		System.out.println("2 parameter constructor");
	}
}

public class Que_7
{
	public static void main(String[] args)
	{
		sub1 s=new sub1();
		sub1 w=new sub1(2);
		sub1 q=new sub1(3,5);
		
	}
}
