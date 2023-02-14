
import java.util.Scanner;
public class ShapeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Sqaure");
		System.out.println("Enter the Shape:");
		String shape=sc.next();
		
		if(!shape.equals("Circle")&&!shape.equals("Square"))
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		switch(shape)
		{
		case "Circle":
			Circle circle=new Circle();
			System.out.println("Enter the Radius:");
			int radius=sc.nextInt();
			
			if(radius<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
			double cirlcearea=circle.calculateArea(radius);
			System.out.println("The area of Circle is:" + (double)Math.round(cirlcearea*100)/100);
			break;
		
		case "Square":
			Square square=new Square();
			System.out.println("Enter the length of square:");
			int length=sc.nextInt();
			
			if(length<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
				
			}
			
			double squarearea=square.calculateArea(length);
			System.out.println("The area of Square is:" + (double)Math.round(squarearea*100)/100);
			break;
		}
		sc.close();

		
	}

}
