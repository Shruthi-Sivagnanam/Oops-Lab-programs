import java.io.*;
import java.util.Random;
class Square implements Runnable
{
	Thread t;
	int num1;
	Square(int num)
	{
		num1=num;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println("The Square of the number is: "+(num1*num1));
	}
}
class Cube implements Runnable
{
	Thread t;
	int num2;
	Cube(int num)
	{
		num2=num;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println("The Cube of the number is: "+(num2*num2*num2));
	}
}
class Threaddemo
{
   public static void main(String args[])
   {
	int r;
	Random rand=new Random();
	Square s;
	Cube c;
	for(int i=5;i>0;i--)
	{
		r=rand.nextInt(10);
		System.out.println("The random number is: "+r);
		if(r%2==0)
			s=new Square(r);
		else 
			c=new Cube(r);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
	}
	
   }
}