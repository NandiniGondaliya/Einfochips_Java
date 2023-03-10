import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainExercise8_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please provide the number of players to be registered");
		Scanner sc=new Scanner(System.in);
		int numberOfPlayers=sc.nextInt();
		String skills[]= {"All Rounder","Batsman","Bowler"};
		sc.nextLine();
		
		ArrayList<Player> players=new ArrayList<Player>();
		
		for(int i=1;i<=numberOfPlayers;i++)
		{
			System.out.println("Please enter player name");
			String name=sc.nextLine();
			System.out.println("Please select the skill of the player \n1.All Rounder\n2.Batsman\n3.Bowler");
			int choice=sc.nextInt();
			sc.nextLine();
			players.add(new PlayerEx1(name,skills[choice-1]));
		}
		PlayerComparator playerComparator=new PlayerComparator();
		Collections.sort(players,playerComparator);
		
		System.out.println("Player Details");
		for(Player player:players)
			System.out.println("Player: "+player.getName()+":"+player.getSkill());
		
	}

}
