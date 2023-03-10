
public class PlayerEx3 {
	private String name,team,skill;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public PlayerEx3(String name, String team, String skill) {
		super();
		this.name = name;
		this.team = team;
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + ", skill=" + skill + "]";
	}

	public PlayerEx3() {
		super();
	}
	
}