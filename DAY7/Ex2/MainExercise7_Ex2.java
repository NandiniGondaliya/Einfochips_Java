import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MainExercise7_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of matches");
		ArrayList<Match> matches=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int numberOfMatches=sc.nextInt();
		
	    for(int i=1;i<=numberOfMatches;i++)
	    {
			System.out.println("Enter match date in (yyyy-MM-dd)");
			String date=sc.next();
			System.out.println("Enter Team 1: ");
			String team1=sc.next();
			
			System.out.println("Enter Team 2: ");
			String team2=sc.next();
			
			Match match=new Match(team1,team2,LocalDate.parse(date));
			matches.add(match);
		
	    }
		
	    Collections.sort(matches);
	    System.out.println("Match details");
	    for(Match match:matches) {
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
	    	System.out.println("Match held on :"+ formatter.format( match.getDate()));
	    	System.out.println("Team 1: "+match.getTeam1());
	    	System.out.println("Team 2: "+match.getTeam2());
	    }
	  		
		sc.close();
		
	}

}