
public class PlayerEx1 {
	private String name;
	private String skill;
	public PlayerEx1()
	{
		
	}
	@Override
	public String toString() {
		return "player{name:" + name + ", skill:" + skill + "}";
	}
	public PlayerEx1(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

}
