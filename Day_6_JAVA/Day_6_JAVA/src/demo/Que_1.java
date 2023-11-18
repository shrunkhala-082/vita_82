package demo;

interface Shape
{
	void draw();
}
class Triangle implements Shape
{
	public void draw()
	{
		System.out.println("draw Triangle ....");
	}
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("draw Rectangle ....");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("draw Circle ....");
	}
}

//on client side 
public class Que_1
{
	public static void main(String args[])
	{
		Shape shape[] = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Rectangle();
		shape[2] = new Circle();
		for(int i=0; i<shape.length; i++)
		{
			shape[i].draw();
		}
	}
}