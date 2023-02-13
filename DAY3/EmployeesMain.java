package DAY2;

import java.util.Scanner;
class EmployeesMain {
    public static void main(String[] args) {
        String name;
        String address;
        String mobile;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        name=sc.next();
        System.out.println("Enter Address:");
        address=sc.next();
        System.out.println("Enter Mobile:");
        mobile=sc.next();
        
        
        Employees emp=new Employees(name,address,mobile);
        emp.display();
        

        int choice;
       // choice=sc.nextInt();
        
       do{
        System.out.println("Verify and Update the details:");
        System.out.println("Menu");
        System.out.println("1. Update Employee name");
        System.out.println("2. Update Employee Address");
        System.out.println("3. Update Employee mobile");
        System.out.println("4. All information correct/Exit");
        choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Current name is:"+name);
                System.out.println("Enter Name:");
                name=sc.next();
                break;
            case 2:
                System.out.println("Current Address is:"+address);
                System.out.println("Enter Address:");
                address=sc.next();
                break; 
            case 3:
                System.out.println("Current Mobile is:"+mobile);
                System.out.println("Enter Mobile:");
                mobile=sc.next();
                break;   
            case 4:
                System.out.println("The Details are:");
                System.out.println("Name:"+name);
                System.out.println("Address:"+address);
                System.out.println("Phone:"+mobile);   
                break;             
        }
    
       }
        while(choice<4 && choice>0);
        


        sc.close();
    }
}
