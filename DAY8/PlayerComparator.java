import java.util.Comparator;

public class PlayerComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		return p1.getSkill().compareTo(p2.getSkill());
	}



}