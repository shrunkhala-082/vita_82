package demo;

import static java.lang.System.out;
import java.util.Scanner;

class asl
{
	private int num;
	
	public void setNum(int k)
	{
		this.num=k;
	}
	
	public int getNum()
	{
		return num;
	}
}

public class Day2_Ex_4
{
	public static void main(String [] args)
	{
		  asl ob=new asl();
		  ob.setNum(200);
		  System.out.println(ob.getNum() );
		   asl ref=ob;
		   ob=new asl();
		   ob.setNum(21);
		   System.out.println(ob.getNum());
		   
		   
		  
		  
	}
}

