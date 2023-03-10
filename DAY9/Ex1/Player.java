
public class Player {

	String bowlerName;
	Integer wicket;

	public String getBowlerName() {
		return bowlerName;
	}
	public Player() {
		super();
	}
	public Player(String bowlerName, Integer wicket) {
		super();
		this.bowlerName = bowlerName;
		this.wicket = wicket;
	}
	@Override
	public String toString() {
		return "Player [bowlerName=" + bowlerName + ", wicket=" + wicket + "]";
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public Integer getWicket() {
		return wicket;
	}
	public void setWicket(Integer wicket) {
		this.wicket = wicket;
	}

}