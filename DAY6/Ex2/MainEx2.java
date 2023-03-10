import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class MainEx2 {

	public static void DesplayTeams(ArrayList<String> teams)
	{
		for(String team:teams)
		{
			System.out.println(team);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Teams name:");
		ArrayList<String> teams=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			String name=sc.next();
			teams.add(name);
		}
		
		DesplayTeams(teams);
		
		System.out.println("Enter first position to swap");
		int firstpos=sc.nextInt();
		
		System.out.println("Enter Second position to swap");
		int secondpos=sc.nextInt();
		
		Collections.swap(teams, firstpos, secondpos);
		DesplayTeams(teams);
		sc.close();
		
	}
}
