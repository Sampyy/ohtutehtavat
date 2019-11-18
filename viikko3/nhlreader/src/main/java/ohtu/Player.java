
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String team;
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    private int goals;
    private int assists;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
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
    
    public int getPoints() {
        return goals+assists;
    }
    
    @Override
    public String toString() {
        return name + ", team " + team + ", goals " + goals + ", assists " + assists + ", points " + goals + " + " + assists + " = " + getPoints();
    }
    
    @Override
    public int compareTo (Player player) {
        return getPoints()-player.getPoints();
    }
      
}
