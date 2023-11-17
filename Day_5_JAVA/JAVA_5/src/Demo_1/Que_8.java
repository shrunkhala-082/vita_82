package Demo_1;

interface game
{
	void play();
}
class football implements game
{
	public void play()
	{
		System.out.println("football");
	}
}
class cricket implements game
{
	public void play()
	{
		System.out.println("cricket");
	}
}

class tennis implements game
{
	public void play()
	{
		System.out.println("tennis");
	}
}


public class Que_8

{
	
	static void perform(game ref)
	{
		ref.play();
	}
	public static void main(String[] args)
	{
		
		
		Que_8.perform(new tennis());
		
	}
}
