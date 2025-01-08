class Bowler {
    
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    
    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    
    public void computeBowlingAverage() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        double bowlingAvg = (wickets == 0) ? 0 : (double) runs_conceded / wickets;
        System.out.printf("Name: %s\nbowling_avg=%.1f\n", name, bowlingAvg);
    }

    
    public void showStatistics() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        System.out.printf("Name=%s\nwickets=%d\nmatches=%d\nballs_bowled=%d\nruns_conceded=%d\n",
                name, wickets, matches, balls_bowled, runs_conceded);
    }

    
    public void computeStrikeRate() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        double strikeRate = (balls_bowled == 0) ? 0 : (double) runs_conceded / balls_bowled;
        System.out.printf("Name: %s\nStrike_rate=%f\n", name, strikeRate);
    }
}

public class Testing {
    public static void main(String[] args) {
        
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);

        
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}