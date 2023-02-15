
import java.util.Scanner;

public class MainException4 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			String teams[] = { "Sun Risers", "Delhi Daredevils", "Kings XI Punjab", "Kolkata Knight Riders",
					"Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore" };
	
			System.out.println("Enter the expected winner team of IPL Season 10 :");
			String team1= sc.nextLine();
			
			boolean found=false;
			for (String team : teams) {
				if (team.toLowerCase().equals(team1.toLowerCase())) {
					found=true;
					break;
				}
			}
			
			
			if(!found)
			{
				throw new TeamNameNotFoundException("CustomException : Entered team is not a part of IPL Season 10");
			}
			
			System.out.println("Enter the expected runner Team of IPL Season 10: ");
			
			String team2= sc.nextLine();
			
			found=false;
			for (String team : teams) {
				if (team.toLowerCase().equals(team2.toLowerCase())) {
					found=true;
					break;
				}
			}
			if(!found)
			{
					throw new TeamNameNotFoundException("CustomException:Entered team is not a part of IPL Season 10");
			}
			System.out.println("Expected IPL Season 10 winner: "+team1);
			System.out.println("Expected IPL Season 10 runner: "+team2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	

}