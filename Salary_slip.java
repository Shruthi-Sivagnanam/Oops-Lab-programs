import java.util.Scanner;
class Employee{
  String Emp_name;
  int Emp_id;
  String Address;
  String Mail_address;
  long Mobile_no;
  public void sal_calc(float bp)
  {
  float gross,net,da,hra,pf,cf;
  da = (float)0.97*bp;
  hra = (float)0.1*bp;
  pf = (float)0.12*bp;
  cf = (float)0.001*bp;
  gross = bp + da + hra;
  net = gross - (pf + cf);
  System.out.println("The gross salary is: " +gross + "\nThe net salary is: " + net);
  }
  public void pay_slip()
  {
  System.out.println("Employee name: " +Emp_name + "\nEmployee id: " +Emp_id + "\nEmployee address: " +Address + "\nEmployee Mail address: " +Mail_address + "\nEmployee Mobile number: " +Mobile_no);
  } 
}
  class Programmer extends Employee{
  float bp;
  }
   class Assistant_professor extends Employee{
  float bp;
  }
  
  class Associate_professor extends Employee{
  float bp;
  }

  class Professor extends Employee{
  float bp;
  }
 
 
public  class Salary_slip{
    public static void main(String args[]){
      Programmer pay1 = new Programmer();  
      Assistant_professor pay2 = new Assistant_professor();
      Associate_professor pay3 = new Associate_professor();
      Professor pay4 = new Professor();
      int ch;
      float bp;
      System.out.print("1.Programmer\n2.Assistant_professor\n3.Associate_professor\n4.Professor\nEnter your choice: ");
      Scanner sc = new Scanner(System.in);
      ch = sc.nextInt();
      switch(ch)
      { 
      case 1:
	     System.out.print("Enter your name: ");
             pay1.Emp_name = sc.next();
             System.out.print("Enter your id: ");
             pay1.Emp_id = sc.nextInt();
             System.out.print("Enter your address: ");
             pay1.Address = sc.next();
             System.out.print("Enter your mobile number: ");
             pay1.Mobile_no = sc.nextLong();
             System.out.print("Enter your mail address: ");
             pay1.Mail_address = sc.next();
             bp = 100000;
             pay1.pay_slip();
             pay1.sal_calc(bp);
             break;

       case 2:
             System.out.print("Enter your name: ");
             pay2.Emp_name = sc.next();
             System.out.print("Enter your id: ");
             pay2.Emp_id = sc.nextInt();
             System.out.print("Enter your address: ");
             pay2.Address = sc.next();
             System.out.print("Enter your mobile number: ");
             pay2.Mobile_no = sc.nextLong();
             System.out.print("Enter your mail address: ");
             pay2.Mail_address = sc.next();
             bp = 75000;
             pay2.pay_slip();
             pay2.sal_calc(bp);
             break;
             
       case 3:
             System.out.print("Enter your name: ");
             pay3.Emp_name = sc.next();
             System.out.print("Enter your id: ");
             pay3.Emp_id = sc.nextInt();
             System.out.print("Enter your address: ");
             pay3.Address = sc.next();
             System.out.print("Enter your mobile number: ");
             pay3.Mobile_no = sc.nextLong();
             System.out.print("Enter your mail address: ");
             pay3.Mail_address = sc.next();
             bp = 70000;
             pay3.pay_slip();
             pay3.sal_calc(bp);
             break;
 case 4:
             System.out.print("Enter your name: ");
             pay4.Emp_name = sc.next();
             System.out.print("Enter your id: ");
             pay4.Emp_id = sc.nextInt();
             System.out.print("Enter your address: ");
             pay4.Address = sc.next();
             System.out.print("Enter your mobile number: ");
             pay4.Mobile_no = sc.nextLong();
             System.out.print("Enter your mail address: ");
             pay4.Mail_address = sc.next();
             bp = 80000;
             pay4.pay_slip();
             pay4.sal_calc(bp);
             break;
             }
}
}
