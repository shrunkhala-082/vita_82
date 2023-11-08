package Demo;

class first
{
	private int num=200;
 public first()	
 {
  	 System.out.println("deafalut first");
 }
 void setfirst(int num)
 {
	 this.num=num;
 }
 
 int getfirst()
 {
	 return getfirst();
 }
}
class second extends first
{
	String ch;
	public second()
	{
		System.out.println(" default second ");
	}
	void setsecond(String ch)
	{
		this.ch=ch;
	}
	
	String getsecond()
	{
		return getsecond();
	}
}
	public class Day4_1
	{
	public static void main(String[] args)
	{
		first f=new first();
		second s=new second();
		f.getfirst();
		
		
		
		
	}
}


