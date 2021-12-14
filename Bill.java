import java.util.Scanner;
class Elec_bill
{
	String consumer_no,consumer_name;
	double pmr,cmr,s;
	char type;
	void unit()
	{
		s=cmr-pmr;
	}
	void domestic()
	{ 
		double total=0;
		if(s<=100)
			total=s*1;
		else if(s>100 && s<=200)
			total=(100*1)+((s-100)*2.50);
		else if(s>200 && s<=500)
			total=(100*1)+(100*2.50)+((s-200)*4);
		else if(s>500)
			total=(100*1)+(100*2.50)+(300*4)+((s-500)*6);
		System.out.print("The bill amount is "+total);
	}
	void commerical()
	{
		double total=0;
		if(s<=100)
			total=s*2;
		else if(s>100 && s<=200)
			total=(100*1)+((s-100)*4.50);
		else if(s>200 && s<=500)
			total=(100*1)+(100*4.50)+((s-200)*6);
		else if(s>500)
			total=(100*1)+(100*4.50)+(300*6)+((s-500)*7);
		System.out.print("The bill amount is "+total);
	}
	void display()
	{
		System.out.println("The consumer no : "+consumer_no);
		System.out.println("The consumer name: "+consumer_name);
	}
}

public class Bill
{
public static void main(String[] arg)
{
	Scanner reader= new Scanner(System.in);
	Elec_bill obj = new Elec_bill();
	System.out.print("Enter the consumer no: ");
	obj.consumer_no=reader.nextLine();
	System.out.print("Enter the consumer name: ");
	obj.consumer_name=reader.nextLine();
	System.out.print("Enter type of eb: <d- domestic and c-commerical> ");
	obj.type=reader.next().charAt(0);
	System.out.print("Enter the perivous month reading: ");
	obj.pmr=reader.nextDouble();
	System.out.print("Enter the next month reading: ");
	obj.cmr=reader.nextDouble();
	obj.unit();
	System.out.println("Electric billing");
	switch(obj.type)
	{
	case 'd':
		obj.domestic();
		break;
	case 'c':
		obj.commerical();
		break;
	}
}
}
	
	