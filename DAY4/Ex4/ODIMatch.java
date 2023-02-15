
public class ODIMatch extends Match {

	float calculateRunRate()
	{
		return (this.getTarget()-this.getCurrentscore())/(50 - this.getCurrentover());
	}

	int calculateBalls()
	{
		return (int) ((50 - this.getCurrentover())*6);
	}

	void display(double reqRunrate, int balls)
	{
		System.out.println("Need "+ (this.getTarget() - this.getCurrentscore()) + " runs in "+ balls+" balls");
		System.out.println("Require Runrate:"+ reqRunrate);
	}
}
