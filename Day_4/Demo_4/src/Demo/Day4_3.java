
class Check
{
	int num=1;
	public int ch=3;
	protected int num1=6;
	public String a="shrunkhala";
	
	public void disp()
	{
		System.out.println("check disp");
		System.out.println(num);
		System.out.println(ch);
		System.out.println(a);
		System.out.println(num1);
		
	}	
	
	
}

public class Day4_3
{
	public static void main(String[] args)
	{
		Check c=new Check();
		//c.disp();
		System.out.println(c.num1);
		System.out.println(c.a);
		
		
	}
}