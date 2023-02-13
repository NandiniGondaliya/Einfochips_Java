
class TwoWheeler extends Vehicle{

	public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		
	}

	private String KickStartAvailable;
	
	public String isKickStartAvailable() {
		return KickStartAvailable;
	}

	public void setKickStartAvailable(String kickStartAvailable) {
		this.KickStartAvailable = kickStartAvailable;
	}

	void displayDetailInfo()
	{
		super.displayMake();
		super.displayBasicInfo();
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available:"+getKickStartAvailable());
	}

	public String getKickStartAvailable() {
		return KickStartAvailable;
	}
}
