
public class DeluxeRoom extends HotelRoom{

	protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=10;
		
	}

	int getRatePerSqFeet()
	{
		if(hasWifi)
		{
			return (ratePerSqFeet += 2);
		}
		else
		{
			return ratePerSqFeet;
		}
		
	}
}
