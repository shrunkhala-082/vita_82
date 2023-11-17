package Demo_1;
abstract class shape
{
	abstract void draw1();
}
class Triangle extends shape
{
	public void draw1()
	{
		System.out.println("inside class triangle");
	}
}
class Polygon extends shape
{
	public void draw1()
	{
		System.out.println("inside class Polygon");
	}
}

class Circle extends shape
{
	public void draw1()
	{
		System.out.println("inside circle");
	}
}
 

public class Que_3
{
	public static void main(String [] args)
	{
		
		shape arr[]=new shape[3];
		arr[0]=new Triangle();
		arr[1]=new Polygon();
		arr[2]=new Circle();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].draw1();
		}
		
		
	}
	

}
