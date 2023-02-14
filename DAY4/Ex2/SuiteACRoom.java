
public class SuiteACRoom extends HotelRoom{

	int ratePerSqFeet;
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=15;
	}
	
	int getRatePerSqFeet()
	{
		if(this.hasWifi)
		{
			return (ratePerSqFeet += 2);
		}
		else
		{
			return ratePerSqFeet;
		}
		
	}

}
