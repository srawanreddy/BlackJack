import java.util.*;
public class School
 {
  protected void sessions()// can access outside the class only through inheritance
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("select time from below to know which class is running");
	System.out.println("1=9.00 am"+"\n"+"2=10.00 am"+"\n"+"3=11.00 am"+"\n"+"4=12.00 pm"+"\n"+"5=1.00 pm" );
	int i=sc.nextInt();

	switch(i)
	 	{
		
		 case 1:
			System.out.println("Mathematics class");
			break;
		case 2:
			System.out.println("Science class");
			break;
		case 3:
			System.out.println("History class");
			break;
		case 4:	
			System.out.println("Computer class");
			break;
		case 5:
			System.out.println("school closed for today");
			break;
		default:
			System.out.println("Invalid option");
		}
			
		sc.close();
			
	}
}
