public class Player implements Comparable<Player> {
	String name;
	
	public Player()
	{
		
	}
	
	public Player(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return ("{name:" + name+"}") ;
	}
	
	
}