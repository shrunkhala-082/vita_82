package Demo_1;

class Top1
{
	void disp1()
	{
	System.out.println("top1 class");	
	}
}
class Bottom1 extends Top1
{
	void disp1()
	{
		System.out.println("inside bottom1 class");
	}
}
class Bottom2 extends Top1
{
	
	void disp1()
	{
		System.out.println("insode bottom2 class ");
	}
}
class Bottom3 extends Top1
{
	void disp1()
	{
		System.out.println("inside bottom3 class");
	}
}

public class Que_2
{
	public static void main(String [] args)
	{
		Top1 t=new Bottom1();
		t.disp1();
		
		Top1 u=new Bottom2();
		u.disp1();
		
		Bottom3 b=new Bottom3();
		b.disp1();
		
		
		
				
	}
}