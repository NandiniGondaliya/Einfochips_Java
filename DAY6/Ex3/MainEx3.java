import java.util.Scanner;
import java.util.ArrayList;
public class MainEx3 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> playersIPL14=new ArrayList<>();
		ArrayList<String> playersIPL15=new ArrayList<>();
		
		System.out.println("Enter the top 5 Scores of IPL season 14");
		for(int i=0;i<5;i++)
		{
			String name1=sc.next();
			playersIPL14.add(name1.toLowerCase().trim());
		}
		
		System.out.println("Enter the top 5 Scores of IPL season 15");
		for(int i=0;i<5;i++)
		{
			String name2=sc.next();
			playersIPL15.add(name2.toLowerCase().trim());
		}
		System.out.println("Consistent Scorer/es");
		
		playersIPL14.retainAll(playersIPL15);
		
		for(String playerIPL14:playersIPL14)
		{
			System.out.println(playerIPL14);
		}
		sc.close();
	}
}
