
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Team> teams=new ArrayList<Team>();
		System.out.println("Enter number of teams:");
		long numberOfTeams=sc.nextLong();
		
		for(int i=1;i<=numberOfTeams;i++)
		{
			System.out.println("Enter team "+i+" detail");
			System.out.println("Enter name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter number of matches: ");
			int numberOfMatches=sc.nextInt();
			teams.add(new Team(name,numberOfMatches));
		}
		
		Collections.sort(teams,new TeamComparator());
		
		System.out.println("Team list after sort by number of matches");
		
		for(Team team:teams)
			System.out.println(team.getName()+"-"+team.getNumberOfMatches());
		sc.close();
	}
	

}