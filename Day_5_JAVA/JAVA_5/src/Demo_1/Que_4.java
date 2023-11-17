package Demo_1;
interface A
{
	void disp1();
}
interface B extends A
{
	void disp2();
	void disp1();
}
class C implements B
{
	public void disp2()
	{
		System.out.println("inside B class");
	}
    public void disp1()
	{
		System.out.println("inside A class");
	}
}


public class Que_4
{
	public static void main(String[] args)
	{
		
		C t=new C();
		t.disp1();
		
		C r=new C();
		r.disp2();
		
		C q=new C();
		q.disp1();
	
	   A w=new C();
	   w.disp1();
	}
}