
import java.util.Scanner;
public class MatchMain {

	public static void main(String[] args) {
		System.out.println("Enter the match format:");
		System.out.println("1.ODI");
		System.out.println("1.T20");
		System.out.println("1.Test");
       
		Scanner sc=new Scanner(System.in);
		int type=sc.nextInt();
		
		System.out.println("Enter the Current score");
		int score=sc.nextInt();
		
		System.out.println("Enter the Current over");
		int over=sc.nextInt();
		
		System.out.println("Enter the Taregt Score");
		int targescoret=sc.nextInt();
		System.out.println("Requirements:");
		
		switch(type)
		{
		case 1://ODI
			ODIMatch odimatch=new ODIMatch();
			odimatch.setCurrentscore(score);
			odimatch.setCurrentover(over);
			odimatch.setTarget(targescoret);
			odimatch.display(odimatch.calculateRunRate(),odimatch.calculateBalls());
			break;
		
	   case 2://T20
		    T20Match t20=new T20Match();
		    t20.setCurrentover(over);
		    t20.setCurrentscore(score);
		    t20.setTarget(targescoret);
		    t20.display(t20.calculateRunRate(), t20.calculateBalls());
		    break;
		    
	   case 3://Test
		   TestMatch testmatch=new TestMatch();
		   testmatch.setCurrentover(over);
		   testmatch.setCurrentscore(score);
		   testmatch.setTarget(targescoret);
		   testmatch.display(testmatch.calculateRunRate(),testmatch.calculateBalls());
		   break;
		   
	    default:
	    	System.out.println("Invalid Input");
	    	break;
	}
		sc.close();
	}
	

}
