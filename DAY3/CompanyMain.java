package DAY2;
import java.util.Scanner;
public class CompanyMain {
    public static void main(String arf[])
    {
        String name;
        String employee;
        String teamlead;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Company Name:");
        name=sc.next();
        System.out.println("Enter the Employees:");
        employee=sc.next();
        System.out.println("Enter TeamLead:");
        teamlead=sc.next();
        
        
    
        Company cn=new Company(name,employee,teamlead);
        cn.displayCompanyDetails();
        sc.close();
        
    }
}
