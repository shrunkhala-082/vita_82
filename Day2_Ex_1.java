package demo;


import static java.lang.System.out;
import java.util.*;

class ar
{
	private int width;
	    int height;

	public void setWidth(int width)
	{
		
		this.width=width;
	}
	public int getWidth()
	{
	
		return width;
		
	}
	
	public void setHeight(int height)
	{
		this.height=height;
	}
	
	
	public int getHeight()

	{
		return height;
		
	}

}
public class Day2_Ex_1
{
	public static void main(String [] args)
	{
		ar s1=new ar();
		s1.setWidth(40);
		System.out.print("width is=");
		System.out.println(s1.getWidth());
		s1.setHeight(30);
		System.out.println(s1.getHeight());	
	}
	
	
}
