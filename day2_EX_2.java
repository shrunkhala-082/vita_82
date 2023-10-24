package demo;


import static java.lang.System.out;
import java.util.*;

class Shape1
{
	  Shape1()
	{
		System.out.println("default constructor");
	} 
	
	 Shape1(int num)
	{
		this.num=num;
		System.out.println("parameterized construcroe");
	}
	
	Shape1(int m,int k)
	{
		this.num=m;
		this.num=k;
		System.out.println("2 parameter constructor");
		
	}
	private int num,m,k;
	
	
}
public class day2_EX_2

{
	public static void main(String [] args)
     {
    	 Shape1 s1=new Shape1();
    	 
    	 Shape1 s2=new Shape1(10);
    	 
    	 Shape1 s3=new Shape1(10,10);
    	 
     }
}
