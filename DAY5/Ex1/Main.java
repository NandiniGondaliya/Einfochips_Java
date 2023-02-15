
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the total runs scored : ");
		Scanner sc=new Scanner(System.in);
		int overs=0,runs=0;
		
		
		try {
			runs=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
			return;
		}
		
		
		System.out.println("Enter the total overs faced : ");
		
		try {
			 overs=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
		}
		
		
		float runRate=0;
		
		try {
			runRate=(runs/overs);
			System.out.println("Current run rate is :"+(double)(runRate*100)/100);
		}
		catch(Exception e)
		{
			System.out.println( e.getClass().getName());
		}
		sc.close();
	
	}

}
