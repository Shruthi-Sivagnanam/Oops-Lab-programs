import java.util.Scanner;
import java.io.*;
class InvalidPhone extends Exception
{
	InvalidPhone(String r)
	{ super(r); }
}
class InvalidEmail extends Exception
{
	InvalidEmail(String t)
	{super(t);}
}
class UserDefinedException
{
  static void len(int num) throws InvalidPhone
  {
	if(num!=10)
	throw new InvalidPhone("Phone number is invalid");
	else
	System.out.println("Phone number is valid");
  }
  static void atsym(String email) throws InvalidEmail
  {
	int index=email.indexOf('@');
	int index1=email.indexOf('.');
	if(index==-1 && index1==-1)
	throw new InvalidEmail("Email is invalid");
	else
	System.out.println("Email is valid");
  }
  public static void main(String args[])
  {
	Scanner reader=new Scanner(System.in);
	String phone,email;
	int n;
	System.out.print("Enter your phone number: ");
	phone=reader.nextLine();
	System.out.print("Enter your mail id: ");
	email=reader.nextLine();
	n=phone.length();
	try{
 		atsym(email);
	}
	catch(InvalidEmail e)
	{
		System.out.println(e);
	}
	try{
		len(n);
	}
	catch(InvalidPhone e){
		System.out.println(e);
	}
	System.out.println("Thank you!!");	
	
  }

}