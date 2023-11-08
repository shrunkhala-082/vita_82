
package Demo;


class Shape
{
	void draw() 
	{
		
	}
}
class circle extends Shape
{
	void draw()
	{
		System.out.println("Shape of circle");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Shape of rectangle");
	}
}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("Shape of Polygon");
	}

}


public class Day4_9
{
	static void perform(Shape ref)
	{
		ref.draw();
	}
	public static void main(String[] args)
	{
		perform(new Polygon());
	}
}