

import java.util.Scanner;

public class MainEx2 {
	public static void main(String[] args) {
		System.out.println("Enter number of overs : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int runs[];
		
		try {
			runs=new int[size];		
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
			return;
		}
		
		System.out.println("Enter the number of runs for each over :");
		for(int i=0;i<size;i++)
			runs[i]=sc.nextInt();
		
		System.out.println("Enter the over number: ");
		
		try {
			int choice=sc.nextInt();
			System.out.println("Runs scored in this over : "+runs[choice-1]);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
		
		}
		
		
		
		
		
	}
	

}