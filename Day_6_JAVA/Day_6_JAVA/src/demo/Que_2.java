package demo;
interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}

class WindowGUIApp implements MouseHandler,WindowHandler
{
	public void mouseClicked()
	{
		System.out.println("mouseClicked");
	}
	public void mousePressed()
	{
		System.out.println("mousePressed");
	}
	public void mouseReleased()
	{
		System.out.println("mouseReleased");
	}
	public void windowClosing()
	{
		System.out.println("windowClosing");
	}
	public void windowClosed()
	{
		System.out.println("windowClosed");
	}
}
public class Que_2
{
	public static void main(String args[])
	{
		WindowGUIApp w=new WindowGUIApp();
		w.mouseClicked();
		w.mousePressed();
		w.mouseReleased();
		w.windowClosing();
		w.windowClosed();
	}
}