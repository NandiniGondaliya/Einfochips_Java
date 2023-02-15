
public class TestMatch extends Match{

	float calculateRunRate()
	{
		return (this.getTarget()-this.getCurrentscore())/(90 - this.getCurrentover());
	}

	int calculateBalls()
	{
		return  (int)((90 - this.getCurrentover())*6);
	}

	void display(double reqRunrate, int balls)
	{
		System.out.println("Need "+ (this.getTarget() - this.getCurrentscore()) + " runs in "+ balls+" balls");
		System.out.println("Require Runrate:"+ reqRunrate);
	}
}
