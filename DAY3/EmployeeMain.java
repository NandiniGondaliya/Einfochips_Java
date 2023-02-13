package DAY2;

import java.util.Scanner;

public class EmployeeMain {
    /**
     * @param args
     */
    public static void main(String[] args) {

        String name,address;
        String phoneno;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        name=sc.next();
        System.out.println("Enter Address");
        address=sc.next();
        System.out.println("Enter PhoneNo:");
        phoneno=sc.next();
        Employee obj=new Employee();
        obj.setName(name);
        obj.setAddress(address);
        obj.setPhoneno(phoneno);
        System.out.println("Employee Name:"+obj.getName());
        System.out.println("Employee Address:"+obj.getAddress());
        System.out.println("Employee Phoneno:"+obj.getPhoneno());
        
        sc.close();
    }
}
