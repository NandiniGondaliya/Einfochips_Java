import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MainEx3 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		System.out.println("Enter the number of players");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int numberOfPlayers=Integer.parseInt(reader.readLine());
		TreeMap<Integer,Player> capMap=new TreeMap<Integer,Player>();
		
		for(int i=1;i<=numberOfPlayers;i++)
		{
			System.out.println("Enter the details player : "+i);
			capMap.put(Integer.parseInt(reader.readLine()), new PlayerEx3(reader.readLine(),reader.readLine(),reader.readLine()));
		}
		System.out.println("Player Details");
		
		for(Map.Entry<Integer, PlayerEx3> entry:capMap.entrySet())
		{
			System.out.println(entry.getKey()+"--"+entry.getValue().getName()+"--"+entry.getValue().getTeam()+"--"+entry.getValue().getSkill());
		
		}
	}

}