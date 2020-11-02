import java.util.*;

public class Result
{
	
	public static void main(String[] args)
	{
		
	  int math, eng,sci,gk,hindi,total;
		double percentage;
		Scanner sc =new Scanner(System.in);
	 
	  System.out.println("Enter your marks");
	  
	  System.out.println("Math: ");
	  math= sc.nextInt();
	  
	  System.out.println("english: ");
	  eng= sc.nextInt();
	  
	  System.out.println("science: ");
	  sci= sc.nextInt();
	  
	  System.out.println("GK: ");
	  gk= sc.nextInt();
	  
	  System.out.println("Hindi: ");
	  hindi= sc.nextInt();	  
	  
	  total=math+eng+sci+gk+hindi;
	  percentage=(total/500.0)*100;
	  System.out.println("Your percentage is: "+percentage);
	
	  if(percentage<=30)
	     System.out.println("fail");
	     
	  else if(percentage<=50)
	     System.out.println("Grade D");
	     
	  else if(percentage<=70)
	     System.out.println("Grade C");
	     
	  else if(percentage<=90)
	     System.out.println("Grade B");
	     
	  else if(percentage<=100)
	     System.out.println("Grade A");
		}
	
	 
	  
	  
	
	}
