import java.util.Scanner;

public class Workers
{
	
	Scanner sc= new Scanner(System.in);
     
   String name;
   int monthlysalary,annualsalary,dayofbirth,Age,
   monthofbirth,yearofbirth,presentyear;
	  
	 public void getDetails()
	 {
	 	System.out.println("Enter the name: ");
	   name = sc.nextLine();
	   
	   System.out.println("Birthdate: ");
	   dayofbirth = sc.nextInt();
	   monthofbirth = sc.nextInt();
	   yearofbirth = sc.nextInt();	
	   
	   System.out.println("Give present year: ");
	   presentyear =  sc.nextInt();
	   
	   System.out.println("Monthly salary: ");
	 	monthlysalary= sc.nextInt();
	 	}
	   
	 
	 
	 
	   	
	 public void displayDetails()
	 {
	  	
	  	Age= presentyear-yearofbirth;
	  	annualsalary=monthlysalary*12;
	    System.out.println("your age is: "+Age+"\n"+"Annual salary is: "+annualsalary);
	    
	    
	  }
	  
	  public void calculateTax()
	 {
	 	 if(annualsalary<=200000)
	 	 {
	 	 	System.out.println("Required 5% of tax");
	 	 	}
	 	 
	 	 else if(annualsalary<=300000)
	 	 {
	 	 	System.out.println("Required 10% of tax");
	 	 	}
	 	 	
	 	 else if(annualsalary<=400000)
	 	 {
	 	 	System.out.println("Required 15% of tax");
	 	 	}
	 	 
	 	 else if(annualsalary>400000)
	 	 {
	 	 	System.out.println("Required 20% of tax");
	 	 	}
	 	 
	 	 
	 	}	
	 
	 
	 
 public static void main(String arg[])
 {
	   	
	   	Workers w1= new Workers();
	     Workers w2= new Workers();
	   
	     w1.getDetails();
	     w1.displayDetails();
 	    w1.calculateTax();
 	
 	}
	
	
	
	
	}

	   
  
	   	
	   	
	  
	   
	   
	   


