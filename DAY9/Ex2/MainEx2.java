

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<Wicket>> players=new HashMap<String,ArrayList<Wicket>>();
		Scanner sc=new Scanner(System.in);
		
		String choice="yes";
		while(choice.equals("yes"))
		{
			System.out.println("Enter the player name:");	
			ArrayList<Wicket> wickets=new ArrayList<Wicket>();
			String name=sc.nextLine();
			System.out.println("Enter wickets - seperated by '|' symbol ");
			String wicketsInput[]=sc.nextLine().split("\\|");
			
			
			for(String wicket:wicketsInput)
			{
				wickets.add(new Wicket(wicket,new Bowler(wicket)));
			}
			System.out.println("Do you want to add another player (yes/no)");
			choice=sc.nextLine();
			
			players.put(name, wickets);
			
		}
		
		boolean wantsToSearch=true;
		while(wantsToSearch)
		{
			System.out.println("Enter the player name to search");
			String name=sc.nextLine();
			if(players.containsKey(name))
			{
				System.out.println("Player name :"+name);
				ArrayList<Wicket> wicketsForPlayer=players.get(name);
				for(Wicket wicket:wicketsForPlayer)
				{
					System.out.println(wicket.getPlayerName());
				}
			}
			else
			{
				System.out.println("Player not found");

			}
			System.out.println("Do you want to continue searching: ");
			wantsToSearch= sc.next().equals("yes")? true:false;
			sc.nextLine();
		}
		sc.close();
	}

}