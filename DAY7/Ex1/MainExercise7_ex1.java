import java.util.Scanner;
import java.util.TreeSet;

public class MainExercise7_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> players=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=n;i++)
			players.add(sc.nextLine());
		
		for(String player:players)
			System.out.println(player);
		sc.close();
	}
	

}