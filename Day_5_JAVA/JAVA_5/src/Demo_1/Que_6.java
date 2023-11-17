package Demo_1;


class Parent1
{
	 void disp()
	{
		System.out.println("sop");
	}
}
interface parent2
{
	public void disp2();
}

class Child extends Parent1 implements parent2
{
	public void disp2()
	{
		System.out.println("check disp2");
	}	
}

public class Que_6
{
	public static void main(String [] args)
	{
	   	Parent1 ref=new Parent1();
	   	ref.disp();
	   	Child r =new Child();
	   	r.disp2();
	}
}
