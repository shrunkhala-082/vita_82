package Demo_1;


class Vehicle
{
	public void start()
	{
	System.out.println("inside vehicle class");
	}

}
	class fourwheeler extends Vehicle
{
public void start()
{
	System.out.println("inside fourwheeler class");
}
}
public class Que_1
{
public static void main(String[] args)
{
	Vehicle v1=new Vehicle();
	v1.start();
	
	Vehicle w= new fourwheeler();
	w.start();			
}
}