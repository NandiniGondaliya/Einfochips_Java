import java.util.HashMap;
import java.util.Scanner;



public class MainEx1 {
	public static void main(String[] args) {
	
		HashMap<String,Integer> players=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		
		String choice="yes";
		while(choice.equals("yes"))
		{
			System.out.println("Enter the player name:");	
			
			String name=sc.nextLine();
			System.out.println("Enter wickets - seperated by '|' symbol ");
			String wickets=sc.nextLine();
			System.out.println("Do you want to add another player (yes/no)");
			choice=sc.nextLine();
			Player player=new Player(name, wickets.split("\\|").length);
			players.put(player.getBowlerName(), player.getWicket());
			
		}
		
		boolean wantsToSearch=true;
		while(wantsToSearch)
		{
			System.out.println("Enter the player name to search");
			String name=sc.nextLine();
			if(players.containsKey(name))
			{
				System.out.println("Player name :"+name);
				System.out.println("Wicket count: "+players.get(name));
			}
			else
			{
				System.out.println("Player not found");
			}
		}
		sc.close();
	}
}
