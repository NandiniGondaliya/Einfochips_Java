import java.util.Scanner;
import java.util.ArrayList;
public class MainEx1 {

	
	public static void DesplayDetails(ArrayList player)
	{
		System.out.println("Player Detail");
		for(Object i:player)
		{
			System.out.println(i);
		}
	}
	public static void main(String d[])
	{
		String name;
		int age;
		String country;
		String skill;
		int position;
		int removepos;
		
		ArrayList player=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player Details");
		System.out.println("Enter Player Name");
		name=sc.next();
		player.add(name);
		System.out.println("Enter age");
		age=sc.nextInt();
		player.add(age);
		System.out.println("Enter Country");
		country=sc.next();
		player.add(country);
		DesplayDetails(player);
		
		System.out.println("Enter Skill");
		skill=sc.next();
		
		ArrayList<String> skills=new ArrayList<>();
		skills.add("batsman");
		skills.add("bowler");
		skills.add("All Rounder");
		skills.add("Wicket keeper");
		
		
		if(!skills.contains(skill.toLowerCase()))
		{
			System.out.println("You have entered wrong skills");
			return;
		}
		System.out.println("Enter the position to add skills");
		position=sc.nextInt();
		player.set(position,skill);
		
		DesplayDetails(player);
		
		System.out.println("Enter the position of the detail to be removed");
		removepos=sc.nextInt();
		
		player.remove(2);
		DesplayDetails(player);
		
		sc.close();
		
	}
}
