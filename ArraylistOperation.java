import java.util.*;
import java.io.*;
class Arraymethods
{
  Scanner reader=new Scanner(System.in);
  ArrayList<String> a=new ArrayList<String>();
  String s1;
    void append()
  {
	System.out.print("Enter the string to be added: ");
	s1=reader.nextLine();
	a.add(s1);
	System.out.println("Array list after appending: "+a);
  }
  void insert()
  {
	int loc;
	System.out.print("Enter the string to be inserted: ");
	s1=reader.nextLine();
	System.out.print("Enter the location: ");
	loc=reader.nextInt();
	a.add(loc,s1);
	System.out.println("Array list after inserting: "+a);
  }
  void searchbyelement()
  {
	String s2;
	System.out.print("Enter the sting to be searched: ");
	s2=reader.nextLine();
	if(a.contains(s2))
	System.out.print("The postion of "+s2+" is "+a.indexOf(s2));
	else
	System.out.println("The string is not in the array list");
  }
  void searchbyindex()
  {
	int x,n;
	n=a.size();
	System.out.print("Enter the index of the string to be searched: ");
	x=reader.nextInt();
	try{
		System.out.println("The element in the index "+x+" is "+a.get(x));
	}
	catch(IndexOutOfBoundsException e)
	{
		System.out.println("Out of range");
	}
  }
  void searchbyletter()
  {
	char ch;
	int n,i,v=0;
	n=a.size();
	System.out.print("Enter the first letter of the string: ");
	ch=reader.next().charAt(0);
	for(i=0;i<n;i++)
	{
		if(a.get(i).charAt(0)==ch)
		{
			System.out.println(a.get(i));
			v=1;
		}
	}
	if(v==0)
	{
		System.out.println("No string is found");
	}
  }
}
class ArraylistOperation
{

  public static void main(String args[])
  {
	Scanner reader=new Scanner(System.in);
	int choice,ch,n;
	Arraymethods ob=new Arraymethods();
	do
	{
		System.out.println("\t\t\tArray list Operation");
		System.out.println("1.Append a String");
		System.out.println("2.Insert a String");
		System.out.println("3.Search a String");
		System.out.print("Enter your choice: ");
		choice=reader.nextInt();
		switch(choice)
		{
			case 1:
				ob.append();
				break;
			case 2:
				ob.insert();
				break;
			case 3:
				System.out.println("Searching options");
				System.out.println("1.Search by element");
				System.out.println("2.Search by index");
				System.out.println("3.Search by letter");
				System.out.print("Enter the choice: ");
				n=reader.nextInt();
				switch(n)
				{
					case 1:
						ob.searchbyelement();
						break;
					case 2:
						ob.searchbyindex();
						break;
					case 3:
						ob.searchbyletter();
						break;
					default:
						System.out.println("Wrong choice!!");
				}
				break;
			default:
				System.out.println("Wrong choice!!");
		}
		System.out.print("Do you want to continue?<0/1>: ");
		ch=reader.nextInt();
	}while(ch==1);
	System.out.println("Thank you!!");
  }
}