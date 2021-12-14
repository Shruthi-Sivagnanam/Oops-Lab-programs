import java.util.Scanner;
abstract class Shape
{
	int dim1,dim2;
	Shape(int a ,int b)
	{
		dim1=a;
		dim2=b;
	}
	Shape(int a)
	{
		dim1=a;
	}
	abstract double area();
}
class Rectangle extends Shape
{
	Rectangle(int a, int b)
	{
		super(a,b);
	}
	double area()
	{
		return(double)(dim1*dim2);
	}
}
class Triangle extends Shape
{
	Triangle(int a, int b)
	{
		super(a,b);
	}
	double area()
	{
		return(double)(dim1*dim2*0.5);
	}
}
class Circle extends Shape
{
	Circle(int a)
	{
		super(a);
	}
	double area()
	{
		return(double)(3.14*dim1*dim1);
	}
}
class Area
{
  public static void main(String args[])
  {
	Scanner reader=new Scanner(System.in);
	int choice,ch,a,b;
	do
	{
		System.out.println("\t\t\tArea Calculation");
		System.out.println("1.Rectangle\n2.Triangle\n3.Circle");
		System.out.print("Enter your choice: ");
		choice=reader.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("Enter the length: ");
				a=reader.nextInt();
				System.out.print("Enter the breadth: ");
				b=reader.nextInt();
				Rectangle r=new Rectangle(a,b);
				System.out.println("The area of Rectangle is "+r.area());
				break;
			case 2:
				System.out.print("Enter the base: ");
				a=reader.nextInt();
				System.out.print("Enter the height: ");
				b=reader.nextInt();
				Triangle t=new Triangle(a,b);
				System.out.println("The area of Triangle is "+t.area());
				break;
			case 3:
				System.out.print("Enter the radius: ");
				a=reader.nextInt();
				Circle c=new Circle(a);
				System.out.println("The area of Circle is "+c.area());
				break;
			default:
				System.out.println("Wrong Choice!!");
		}
		System.out.println("Do you want to continue: ");
		ch=reader.nextInt();
	}while(ch==1);
	System.out.println("Thank you!!");
  }
}