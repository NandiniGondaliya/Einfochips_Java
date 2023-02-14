import java.util.Scanner;

public class HotelRoomMain {

	public static void main(String[] args) {
		
		String hotelName;
		int numberOfSqFeet;
		boolean hasTV;
		boolean hasWifi;
		

		System.out.println("1.Deluxe Room");
		System.out.println("2.Deluxe AC Room");
		System.out.println("3.Suite AC Room");
		System.out.println("Select Room Type:");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Hotel Name:");
		hotelName=sc.next();
		System.out.println("Room Square Feet Area::");
		numberOfSqFeet=sc.nextInt();
		System.out.println("Room has TV(yes/no):");
		hasTV=sc.next().toLowerCase().equals("yes") ? true : false;
		System.out.println("Room has Wifi(yes/no):");
		hasWifi=sc.next().toLowerCase().equals("yes")?true: false;
		
		
		int terrif = 0;
		if(choice==1)
		{
			DeluxeRoom dulexroom=new DeluxeRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
			terrif = dulexroom.calculateTariff(dulexroom.getRatePerSqFeet());	
		}
		
		if(choice==2)
		{
			DeluxeACRoom deluxacroom=new DeluxeACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
			terrif=deluxacroom.calculateTariff(deluxacroom.getRatePerSqFeet());
		}
		
		if(choice==3)
		{
			SuiteACRoom suiteacroom=new SuiteACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
			terrif=suiteacroom.calculateTariff(suiteacroom.getRatePerSqFeet());
		}
		System.out.println(terrif);
		
		sc.close();
	}

}
