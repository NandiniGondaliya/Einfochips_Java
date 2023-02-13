import java.util.Scanner;
public class PowerOFtwo {
    public static void main(String ar[])
    {
        System.out.print("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        while(n>1)
        {
            if(n<0)
            {
                System.out.print("Number is too small");
                
            }
            if(n>32767)
            {
                System.out.print("Number is too large");
            }
            if(n%2!=0)
            {
                System.out.print("Given number is not a power of 2");
                break;
            }
            else{
                if(n==2)
            {
                System.out.print("Given number is power of 2");
            }
                n=n/2;
               
            }
            

        }

        sc.close();
    }

}
