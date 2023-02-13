package DAY2;
import java.util.Scanner;

public class Cricketer {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size=sc.nextInt();
        if(size<0)
        {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        System.out.print("Enter value for comparison:");
        int score=sc.nextInt();
        if(score<0)
        {
            System.out.println("Invalid score");
            sc.close();
            return;
        }
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter "+i+" Element here:");
            a[i]=sc.nextInt();
            if(a[i]<0)
            {
                System.out.println("You have entered -ve value");
                System.out.println("Try again");
                sc.close();
                return;
            }

        }
        for(int j=1;j<size;j+=2)
        {
            if(a[j]>score)
            {
                System.out.println(a[j-1]);
            }
        }

        sc.close();
        
    }
}
