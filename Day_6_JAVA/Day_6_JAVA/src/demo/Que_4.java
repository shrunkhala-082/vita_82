package demo;

import java.util.Scanner;
interface Vehicle
{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}

// on the client side 
class FourWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		System.out.println("change gear of Fourwheeler to "+a);
	}
	public void speedUp(int a)
	{
		System.out.println("speed up the Fourwheeler upto "+a);
	}
	public void applyBrakes(int a)
	{
		System.out.println("apply Brakes to Fourwheeler on "+a);
	}
}
class TwoWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		System.out.println("change gear of Twowheeler to "+a);
	}
	public void speedUp(int a)
	{
		System.out.println("speed up the Twowheeler upto "+a);
	}
	public void applyBrakes(int a)
	{
		System.out.println("apply Brakes to Twowheeler on "+a);
	}
}
public class Que_4
{	
	public  static void perform(Vehicle vehicle)
	{
		if(vehicle instanceof FourWheeler)
		{	
			vehicle.changeGear(5);
			vehicle.speedUp(60);
			vehicle.applyBrakes(80);
		}
		else
		{
			vehicle.changeGear(4);
			vehicle.speedUp(40);
			vehicle.applyBrakes(50);
		}
	}
	public static void main(String args[])
	{
		perform(new FourWheeler());
		perform(new TwoWheeler());
	}
}