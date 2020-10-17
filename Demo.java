public class Employee {
    
    String name,city;
    int age;
    
    Employee(String n,String c,int a){
        
       
       name = n;
       city = c;
       age = a;
    }
    
    
    void display(){
        
        System.out.println("The age is"+" "+age);
        System.out.println("The name is"+" "+name);
        System.out.println("The city is"+" "+city);
    }
    
    public static void main(String arg[]){
        
        Employee e1 = new Employee("Anchal","kolkata",12);
        
        Employee e2 = new Employee("Anika","Bihar",19);
        
        System.out.print("employee 1"+"\n");
        e1.display();
        
        System.out.print("\n"+"employee 2"+"\n");
        e2.display();
    }
}
