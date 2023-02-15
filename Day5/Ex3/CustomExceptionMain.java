
import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the player name: ");
		String name=sc.next();
		System.out.println("Enter the player age : ");
		int age=sc.nextInt();
		try {
			if(age < 19)
				throw new CustomException("CustomException: InvalidAgeRangeException");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Player name: "+name);
		System.out.println("Player age: "+age);

	}

}