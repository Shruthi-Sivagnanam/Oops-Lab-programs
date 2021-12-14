import Converter.*;
import java.util.Scanner;
public class Calculation
{
  public static void main(String[] args)
  {
	Scanner reader=new Scanner(System.in);
	int choice,n;
	float item;
	System.out.println("\t\tConverter");
	System.out.println();
	System.out.println("1.Currency Converter");
	System.out.println("2.Distance Converter");
	System.out.println("3.Time Converter");
	System.out.print("Enter your choice: ");
	choice=reader.nextInt();
	switch(choice){
		case 1:
			Currency c=new Currency();
			System.out.println("\t\tCurrency Converter");
			System.out.println("1.Dollor to rupees");
			System.out.println("2.Rupees to dollor");
			System.out.println("3.Euro to rupees");
			System.out.println("4.Rupees to Euro");
			System.out.println("5.Yen to rupees");
			System.out.println("6.Rupees to yen");
			System.out.print("Enter your choice: ");
			n=reader.nextInt();

			switch(n){
				case 1:
					System.out.print("Enter the dollor value: ");
					item=reader.nextFloat();
					System.out.println("Amount value in Rupees is "+c.dol_to_rup(item));
					break;
				case 2:
					System.out.print("Enter the rupee value: ");
					item=reader.nextFloat();
					System.out.println("Amount value in Dollor is "+c.rup_to_dol(item));
					break;
				case 3:
					System.out.print("Enter the euro value: ");
					item=reader.nextFloat(); 
					System.out.println("Amount value in Rupees is "+c.eur_to_rup(item));
					break;
				case 4:
					System.out.print("Enter the rupees value: ");
					item=reader.nextFloat();
					System.out.println("Amount value in Euro is "+c.rup_to_eur(item));
					break;
				case 5:
					System.out.print("Enter the yen value: ");
					item=reader.nextFloat(); 
					System.out.println("Amount value in Rupees is "+c.yen_to_rup(item));
					break;
				case 6:
					System.out.print("Enter the rupees value: ");
					item=reader.nextFloat();
					System.out.println("Amount value in Yen is "+c.rup_to_yen(item));
					break;
				default:
					System.out.println("Wrong Choice");
			}break;
		case 2:
			Distance d=new Distance();
			System.out.println("\t\tDistance converter");
			System.out.println("1.Meter to km");
			System.out.println("2.Km to meter");
			System.out.println("3.Miles to km");
			System.out.println("4.Km to miles");
			System.out.print("Enter your choice: ");
			n=reader.nextInt();
			switch(n){
				case 1:
					System.out.print("Enter the value in meter: ");
					item=reader.nextFloat();
					System.out.println("The value in km is "+d.met_to_km(item));
					break;
				case 2:
					System.out.print("Enter the value in km: ");
					item=reader.nextFloat();
					System.out.println("The value in meter is "+d.km_to_met(item));
					break;
				case 3:
					System.out.print("Enter the value in Miles: ");
					item=reader.nextFloat();
					System.out.println("The value in km is "+d.mil_to_km(item));
					break;
				case 4:
					System.out.print("Enter the value in km: ");
					item=reader.nextFloat();
					System.out.println("the value in km is "+d.km_to_mil(item));
					break;
				default:
					System.out.println("Wrong choice!!");
		}break;
		case 3:
			Timec t=new Timec();
			System.out.println("\t\tTime converter");
			System.out.println("1.Hours to minutes");
			System.out.println("2.Minutes to hours");
			System.out.println("3.Hours to seconds");
			System.out.println("4.Seconds to hours");
			System.out.print("Enter your choice: ");
			n=reader.nextInt();
			switch(n){
				case 1:
					System.out.print("Enter the value in hours: ");
					item=reader.nextFloat();
					System.out.println("The value in minutes is "+t.hr_to_min(item));
					break;
				case 2:
					System.out.print("Enter the value in minutes: ");
					item=reader.nextFloat();
					System.out.println("The value in hours is "+t.min_to_hr(item));
					break;
				case 3:
					System.out.print("Enter the value in hours: ");
					item=reader.nextFloat();					 
					System.out.println("The value in seconds is "+t.hr_to_sec(item));
					break;
				case 4:
					System.out.print("Enter the value in seconds: ");
					item=reader.nextFloat();
					System.out.println("The value in hours is "+t.sec_to_hr(item));
					break;
				default:
					System.out.println("Wrong choice!!");
			}break;
		default:
			System.out.println("Wrong choice!!");
	}
	System.out.println("Thank You!!");
  }
}