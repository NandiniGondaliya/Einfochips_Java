package DAY2;

import java.util.Scanner;
public class InningsMain {
    public static void main(String arf[])
    {
        String teamname;
        String inningname;
        int runs;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Teamname:");
        teamname=sc.next();
        System.out.println("Enter Session:");
        inningname=sc.next();
        System.out.println("Enter Runs:");

        
        
        runs=sc.nextInt();

        Innings In=new Innings(teamname,inningname,runs);
        In.displayInningsDetails();
        sc.close();
        
    }
}
