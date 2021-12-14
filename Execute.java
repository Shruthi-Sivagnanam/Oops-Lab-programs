import java.util.Scanner;

class Compare
{
	public <E extends Comparable<E>> E max(E[] list)
	{
		E maxvalue=list[0];
		for(int i=1;i<list.length;i++)
		{
			if(maxvalue.compareTo(list[i])<0)
				maxvalue=list[i];
		}
		return maxvalue;
	}
}
public class Execute
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		Compare ob=new Compare();
		int choice,ch,n;
		do
		{
			System.out.println("\t\tElements type");
			System.out.println("1.Integer\n2.Float\n3.Double\n4.String\n5.Character");
			System.out.print("Enter your choice: ");
			choice=reader.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter the array size: ");
					n=reader.nextInt();
					Integer[] numbers=new Integer[n];
					System.out.print("Enter the elements: ");
					for(int i=0;i<n;i++)
						numbers[i]=reader.nextInt();
					System.out.println("The maximum element in the Integer array is: "+ob.max(numbers));
					break;
				case 2:
					System.out.print("Enter the array size: ");
					n=reader.nextInt();
					Float[] numbers1=new Float[n];
					System.out.print("Enter the elements: ");
					for(int i=0;i<n;i++)
						numbers1[i]=reader.nextFloat();
					System.out.println("The maximum element in the Float array is: "+ob.max(numbers1));
					break;
				case 3:
					System.out.print("Enter the array size: ");
					n=reader.nextInt();
					Double[] numbers2=new Double[n];
					System.out.print("Enter the elements: ");
					for(int i=0;i<n;i++)
						numbers2[i]=reader.nextDouble();
					System.out.println("The maximum element in the Double array is: "+ob.max(numbers2));
					break;
				case 4:
					System.out.print("Enter the array size: ");
					n=reader.nextInt();
					String[] s=new String[n];
					System.out.print("Enter the elements: ");
					for(int i=0;i<n;i++)
						s[i]=reader.next();
					System.out.println("The maximum element in the String array is: "+ob.max(s));
					break;
				case 5:
					System.out.print("Enter the array size: ");
					n=reader.nextInt();
					Character[] c=new Character[n];
					System.out.print("Enter the elements: ");
					for(int i=0;i<n;i++)
						c[i]=reader.next().charAt(0);
					System.out.println("The maximum element in the Float array is: "+ob.max(c));
					break;
				default:
					System.out.println("Wrong choice!!");
			}
			System.out.println("Do you want to continue?<0/1>: ");
			ch=reader.nextInt();
		}while(ch==1);
		System.out.println("Thank you!!");
	}
}