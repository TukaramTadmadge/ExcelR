package day8;

public class Horse implements Animal  //Horse class must override all the methods of the Animal interface
{
	@Override
	public void eat()
	{
		System.out.println("Horse Eating..");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Horse Sleeping..");
	}
	@Override
	public void run()
	{
		System.out.println("Horse Runing..");
	}
}
