import java.util.Scanner;

class myprogram
{
    public static void main(String[] args) {
        System.out.println("Nandini Gondaliya");
        Scanner sc=new Scanner(System.in);
        
        int salary=sc.nextInt();
        int shift=sc.nextInt();
        double halfsalary;
        double newsalary;
        if(salary>=8000)
        {
            System.out.println("Salary is too high");
        }
        else if(shift<0)
        {
            System.out.println("shift is too low");
        }
        else if(salary<0)
        {
            System.out.println("salary is too low");
        }
        else{
            if(shift>0)
            {
                //System.out.println((salary-(0.5-(shift*0.02))*salary));
                halfsalary=salary/2;
                newsalary=halfsalary+(salary*0.02*shift);
                System.out.println(newsalary);
            }

        }
     sc.close();   
        
    }
}