package demo;


interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
} 

//on client side 
class FileSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		System.out.println("write data inside FileSystem :"+ref);
	}
	public String readData()
	{
		System.out.println("read data from FileSystem");
		return "File System Writing data";
	}
}
class DatabaseSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		System.out.println("write data inside DatabaseSystem "+ref);
	}
	public String readData()
	{
		System.out.println("read data from DatabaseSystems");
		return "Database System Writing data";
	}
}
class BigdataSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		System.out.println("write data inside BigdataSystem"+ref);
	}
	public String readData()
	{
		System.out.println("read data from BigdataSystem ");
		return "Bigdata System Writing data";
	}
}
public class Que_3
{
	public static void main(String args[])
	{
		PersistenceMechanism persistenceMechanism[] = new PersistenceMechanism[3];
		persistenceMechanism[0] = new FileSystem();
		persistenceMechanism[1] = new DatabaseSystem();
		persistenceMechanism[2] = new BigdataSystem();

		for(int i=0; i<persistenceMechanism.length; i++)
		{
			if(persistenceMechanism[i] instanceof BigdataSystem)
			{
				persistenceMechanism[i].writeData(persistenceMechanism[i].readData());
			}
		}
	}
}