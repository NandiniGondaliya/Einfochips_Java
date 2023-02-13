package DAY2;

public class Company {
   private String name;
   private String employee;
   private String teamlead;


   Company(String name,String employee,String teamlead)
    {
        this.name=name;
        this.employee=employee;
        this.teamlead=teamlead;
    }
    public void displayCompanyDetails()
    {
        
        if(!employee.contains(teamlead))
        {
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Name:"+name);
            System.out.println("Employee:"+employee);
            System.out.println("Lead:"+teamlead);
        }

    }
}
