import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player {
	private String name;
	private int score;
	
	public Player() {}
	
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	static void sortPlayer(ArrayList<Player> playerList) {
		Collections.sort(playerList,new Comparator<Player>() {
	         public int compare(Player p1, Player p2) {
	        	 return (p1.score > p2.score) ? -1 : ((p1.score == p2.score) ? 0 : 1); 
	         }
	     });
		System.out.println("after");
		for(int i=0; i < playerList.size(); i++){
            System.out.println("Player("+ playerList.get(i).name+", "+playerList.get(i).score+")" );
        }
	}
	
	public static void main(String[] args)
    {
		Player player = new Player();
		ArrayList<Player> playerList = new ArrayList<>();
		playerList.add(new Player("amy",100));
		playerList.add(new Player("david",100));
		playerList.add(new Player("heraldo",50));
		playerList.add(new Player("aakansha",75));
		playerList.add(new Player("aleksa",150));
		
		for(int i=0; i < playerList.size(); i++){
            System.out.println("Player("+ playerList.get(i).name+", "+playerList.get(i).score+")" );
        }
		
		sortPlayer(playerList);
    }

}
