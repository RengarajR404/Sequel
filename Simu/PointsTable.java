package Simu;

public class PointsTable {
    private Team team;
    private int position, points, played, won, lost, netRunRate;

    public PointsTable(Team team, int position, int points, int played, int won, int lost, int netRunRate) {
        setTeam(team);
        setPosition(position);
        setPlayed(played);
        setPoints(points);
        setWon(won);
        setLost(lost);
        setNetRunRate(netRunRate);
    }

    public PointsTable(Team team) {
        setTeam(team);
        setPosition(0);
        setPoints(0);
        setPlayed(0);
        setWon(0);
        setLost(0);
        setNetRunRate(0);
    }
    public PointsTable()
    {

    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNetRunRate() {
        return netRunRate;
    }

    public void setNetRunRate(int netRunRate) {
        this.netRunRate = netRunRate;
    }

    public void incwon(){ this.won++; }
    public void inclost(){ this.lost++;}
    public void incpoints(){ this.points = this.points+2;}
    public void incplayed(){ this.played++;}
    public void incnrr(int nrr){ this.netRunRate = this.netRunRate + nrr ;}
    public void decnrr(int nrr){ this.netRunRate= this.netRunRate- nrr;}


    @Override
    public String toString() {
        return "PointsTable{" +
                "team=" + team +
                ", position=" + position +
                ", points=" + points +
                ", played=" + played +
                ", won=" + won +
                ", lost=" + lost +
                ", netRunRate=" + netRunRate +
                '}';
    }
}
