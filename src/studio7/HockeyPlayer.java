package studio7;

public class HockeyPlayer {
	
	private String name;
	private int jerseynumber;
	private boolean dominantHandRight; //true if right, false if left
	private boolean shootingHandRight; //true if right, false if left
	private int goals;
	private int assists;
	private int games;


	public HockeyPlayer (String name, int jerseynumber, boolean dominantHandRight, boolean shootingHandRight, int goals, int assists, int games) {
		this.name = name;
		this.jerseynumber = jerseynumber;
		this.dominantHandRight = dominantHandRight;
		this.shootingHandRight = shootingHandRight;
		this.goals = goals;
		this.assists = assists;
		this.games = games;
	}
	
	public int points() {
		return (this.goals + this.assists);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseynumber() {
		return jerseynumber;
	}

	public void setJerseynumber(int jerseynumber) {
		this.jerseynumber = jerseynumber;
	}

	public boolean isDominantHandRight() {
		return dominantHandRight;
	}

	public void setDominantHandRight(boolean dominantHandRight) {
		this.dominantHandRight = dominantHandRight;
	}

	public boolean isShootingHandRight() {
		return shootingHandRight;
	}

	public void setShootingHandRight(boolean shootingHandRight) {
		this.shootingHandRight = shootingHandRight;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}
	
}