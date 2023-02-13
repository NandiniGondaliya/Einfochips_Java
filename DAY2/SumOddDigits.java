import java.util.Scanner;
public class SumOddDigits {
    
    /**
     * @param ar
     */
    public static void main(String ar[])
    {
        System.out.print("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m,sum=0;
        if(n<0 || n>32767)
        {
            System.out.print("Invalid Input");
        }
        else{
             while(n>0)
        {
            m=n%10;
            if(m%2!=0)
            {
                sum=sum+m;
            }
            n=n/10;
        }
        System.out.print(sum);
        }
        sc.close();
       
    }
}
