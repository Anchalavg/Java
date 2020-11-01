import java.util.Scanner;

public class Avenger
{
	Scanner sc= new Scanner(System.in);
	
	  String name,power,planet,weapon;
	  int age;
	
	  public void getDetails()
	  {
	  	System.out.println("Name: ");
		  name= sc.next();
		
		  System.out.println("Power: ");
	  	power= sc.next();
		
	  	System.out.println("Planet: ");
	  	planet= sc.next();
		
	  	System.out.println("Weapon: ");
	  	weapon= sc.next();
		
		  System.out.println("Age: ");
		  age= sc.nextInt();
	  	
	  	}
	
		
		
	  public void displayDetails()
	  {
		  System.out.println("Name: "+name);
		  System.out.println("Age: "+age);
	  	System.out.println("Power: "+power);
		  System.out.println("Planet: "+planet);
		  System.out.println("weapon: "+weapon);
		
	  	}
	
 public static void main(String[] args)
 {
  
 	  Avenger[] avenger= new Avenger[5];
		
		 for(int i=0;i<5;i++){
		 	
		 	avenger[i]= new Avenger();
		 	
		 	
		 	}
		 	
		 for(int i=0;i<5;i++){
		 	
		 	avenger[i].getDetails();
       avenger[i].displayDetails();
		 	
		 	}
	 
 	     
 	
 	}
 	   
 
		
	
	}
