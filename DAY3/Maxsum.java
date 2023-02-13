package DAY2;
import java.util.Scanner;
public class Maxsum {
    public static void main(String f[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.print("Invalid size");
            System.exit(0);
           
        }
        int a[]=new int[n];
        int sumeven=0,sumodd=0;
        for(int i=0;i<n;i++)
        {

            System.out.print("Enter the array element:");
            a[i]=sc.nextInt();
            if(a[i]<0)
            {
                System.out.print("You have given -ve value");
                break;

            }
            if(a[i]%2==0)
            {
                sumeven=sumeven+a[i];
            }
            else{
                sumodd=sumodd+a[i];
            }
        }
        if(sumodd>sumeven)
        {
            System.out.print(sumodd);
        }
        else{
            System.out.print(sumeven);
        }

        sc.close();

    }
}
