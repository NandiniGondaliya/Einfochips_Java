import java.time.LocalDate;

public class Match implements Comparable<Match> {

	private String team1,team2;
	private LocalDate date;
	public Match()
	{
		
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Match(String team1, String team2, LocalDate date) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
	}
	
	public int compareTo(Match match) {
		// TODO Auto-generated method stub
		return  match.getDate().compareTo( this.date);
	
	}
	@Override
	public String toString() {
		return "Match [team1=" + team1 + ", team2=" + team2 + ", date=" + date + "]";
	}
	

	
}