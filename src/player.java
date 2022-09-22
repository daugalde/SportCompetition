
public class player implements Comparable<player> {

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	private String name;
	
	private int gamesPlayed;
	
	private int points;
	
	public player (String name,int games, int points) {
		this.name= name;
		this.gamesPlayed = games;
		this.points = points;
	}
	
	public String toString() {
		
		return this.getName() + " " + this.getGamesPlayed() + " " + this.getPoints();
	}
	
	@Override
	public int compareTo(player o) {

		if(this.getGamesPlayed() == o.getGamesPlayed()) {
			return 0;
		}
		else if (this.getGamesPlayed() > o.getGamesPlayed()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
}
