import java.util.Scanner;
interface IntStack{
	void push(int item);
	void pop();
	void display();
}
class FixedStack implements IntStack
{
	int stack[];
	int top;
	FixedStack(int size)
	{
		stack=new int[size];
		top=-1;
	}
	public void push(int item)
	{
		try{
			top++;
			stack[top]=item;
			System.out.println(item + " is inserted sucessfully");
		}
		catch(ArrayIndexOutOfBoundsException e){
			top--;
			System.out.println("Stack overflow!!");
		}
	}
	public void pop()
	{
		int item;
		try{
			item=stack[top];
			top--;
			System.out.println(item+" is delelted");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Stack underflow!!");
		}
	}
	public void display()
	{
		int i;
		if(top==-1)
			System.out.println("No elements in the stack array");
		else{
			System.out.println("The elements are : ");
			for(i=0;i<=top;i++)
				System.out.print(stack[i] + " ");
			System.out.println();
		} 
	}	
}
public class Stack
{
  public static void main(String args[])
  {
	Scanner reader=new Scanner(System.in);
	FixedStack arr=new FixedStack(5);
	int choice,x,item;
	do{
	System.out.println("\n");
	System.out.println("\t\t\tArray Implementation of Stack");
	System.out.println("1.Push");
	System.out.println("2.Pop");
	System.out.println("3.Display");
	System.out.print("Enter your choice: ");
	choice=reader.nextInt();
	switch(choice){
		case 1:
			System.out.print("Enter the item to be pushed: ");
			item=reader.nextInt();
			arr.push(item);
			break;
		case 2:
			arr.pop();
			break;
		case 3:
			arr.display();
			break;
		default:
			System.out.println("Wrong choice!!");
	}
	System.out.print("do you want to continue?<1/0> ");
	x=reader.nextInt();
	System.out.println(" ");
	}while(x==1);
	System.out.println("Thank You!!");
  }
} 