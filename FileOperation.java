import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Filehandling
{
	void fileExists(File f)
	{
		if(f.exists())
		System.out.println("The file exists");
		else
		System.out.println("The file does not exists");
	}
	void fileReadable(File f)
	{
		if(f.exists())
		{
			if(f.canRead())
			System.out.println("The file is readable");
			else
			System.out.println("The file is not readable");
		}
		else
		System.out.println("The file does not exists");
	}
	void fileWriteable(File f)
	{
		if(f.exists())
		{
			if(f.canWrite())
			System.out.println("The file is writeable");
			else
			System.out.println("The file is not writeable");
		}
		else
		System.out.println("The file does not exists");
	}
	void fileType(File f)
	{
		String fileString;
		if(f.exists())
		{
			fileString=f.getPath();
			String[] fileArray=fileString.split("[\\.]");
			System.out.println("The file is of type "+fileArray[fileArray.length-1]);
		}
		else
		System.out.println("The file does not exists");
	}
	void fileLength(File f)
	{
		if(f.exists())
		System.out.println("The length of the file in bytes is "+f.length());
		else
		System.out.println("The file does not exists");
	}
}
class FileOperation
{
  public static void main(String args[])
  {
	Scanner reader=new Scanner(System.in);
	String filename;
	System.out.print("Enter the file name with directory: ");
	filename=reader.next();
	File f=new File(filename);
	try{
	if(f.createNewFile())
	System.out.println("The file is created successfully");
	else
	System.out.println("The file already exists");}
	catch(IOException e)
	{System.out.println("error");}
	Filehandling fh=new Filehandling();
	int choice,ch;
	do{
		System.out.println("\t\tFile Operations");
		System.out.println("1.Check whether the file exists");
		System.out.println("2.Check whether the file is readable");
		System.out.println("3.Check whether the file is writeable");
		System.out.println("4.Check the type of file");
		System.out.println("5.Display the length of file");
		System.out.print("Enter your choice: ");
		choice=reader.nextInt();
		switch(choice)
		{
			case 1:
				fh.fileExists(f);
				break;
			case 2:
				fh.fileReadable(f);
				break;
			case 3:
				fh.fileWriteable(f);
				break;
			case 4:
				fh.fileType(f);
				break;
			case 5:
				fh.fileLength(f);
				break;
			default:
				System.out.println("Wrong Choice!!");
		}
		System.out.print("Do you want to continue<0/1>?: ");
		ch=reader.nextInt();
	}while(ch==1);
	System.out.println("Thank you!!");
  }
}