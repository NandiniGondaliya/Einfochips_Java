
public class HotelRoom {

	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	int calculateTariff(int costPerSqFeets)
	{
		return this.numberOfSqFeet*costPerSqFeets;
	}
	
	int getRatePerSqFeet()
	{
		return 0;
	}
}