package demo;


public class Weapon
{
	public void attack()
	{
	
	}
}
public class sword extends Weapon
{
	public void attack()
	{
		System.out.println("Sword Slashing ");
	}
}
public class Bomb extends Weapon
{
	public void attack()
	{
		System.out.println("Bomb blasting ");
	}
}
public class Gun extends Weapon
{
	public void attack()
	{
		System.out.println("Gun firing ");
	}
	public void fillBullets()
	{
		System.out.println("Filling Bullets ");
	}
}
public class Que_5
{
	public void fight(Weapon weapon)
	{
		weapon.attack();
		if(weapon instanceof Gun)
		{
			Gun gun = (gun)weapon;
			gun.fillBullets();
		}
	}
}