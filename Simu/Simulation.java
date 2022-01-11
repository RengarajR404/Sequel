package Simu;

import Players.Player;

import java.util.*;

public class Simulation {
    private Team t1, t2;
    private Queue<Player> team1batsman = new LinkedList<>();
    private Queue<Player> team2batsman = new LinkedList<>();
    private List<Player> team1bowler = new ArrayList<>();
    private List<Player> team2bowler = new ArrayList<>();
    private ArrayList<Short> score = new ArrayList<>();
    private ArrayList<Short> wickets = new ArrayList<>();
    private ArrayList<Short> ballsbowled = new ArrayList<>();

    Random r = new Random();

    public Simulation(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.score.add(0,(short)0);
        this.score.add(1,(short)0);
        this.wickets.add(0, (short) 0);
        this.wickets.add(1, (short) 0);
        this.ballsbowled.add(0, (short) 0);
        this.ballsbowled.add(1, (short) 0);
        setTeam1batsman();
        setTeam1bowler();
        setTeam2batsman();
        //setTeam2bowler();
    }
    public Simulation(Match match){
        this.t1 = match.getTeams().get(0);
        this.t2 = match.getTeams().get(1);
        this.score.add(0, (short) 0);
        this.score.add(1, (short) 0);
        this.wickets.add(0, (short) 0);
        this.wickets.add(1, (short) 0);
        this.ballsbowled.add(0, (short) 0);
        this.ballsbowled.add(1, (short) 0);
        setTeam1batsman();
        setTeam1bowler();
        setTeam2batsman();
        //setTeam2bowler();
    }


    public void setTeam1batsman() {
        int i=0;
        while(i<t1.getPlayers().size()){
            if(t1.getPlayers().get(i).getRole().equals("Batsmen")||t1.getPlayers().get(i).getRole().equals("Captain")){
                team1batsman.add(t1.getPlayers().get(i));
                i++;
            }
            else{
                i++;
            }
        }
    }
    public void setTeam2batsman() {
        int i=0;
        while(i<t2.getPlayers().size()){
            if(t2.getPlayers().get(i).getRole().equals("Batsmen")||t2.getPlayers().get(i).getRole().equals("Captain")){
                team2batsman.add(t2.getPlayers().get(i));
                i++;
            }
            else{
                i++;
            }
        }
    }

    public void setTeam1bowler() {
        int i=0;
        while(i<t1.getPlayers().size()){
            if(t1.getPlayers().get(i).getRole().equals("Bowler")||t1.getPlayers().get(i).getRole().equals("All-Rounder")){
                team1bowler.add(t1.getPlayers().get(i));
                i++;
            }
            else{
                i++;
            }
        }
    }

    public void setTeam2bowler() {
        int i=0;
        while(i<t2.getPlayers().size()){
            if(t2.getPlayers().get(i).getRole().equals("Bowler")||t2.getPlayers().get(i).getRole().equals("All-Rounder")){
                team2bowler.add(t2.getPlayers().get(i));
                i++;
            }
            else{
                i++;
            }
        }
    }


    public Team getT1() {
        return t1;
    }

    public Team getT2() {
        return t2;
    }

    public Queue<Player> getTeam1batsman() {
        return team1batsman;
    }

    public Queue<Player> getTeam2batsman() {
        return team2batsman;
    }

    public List<Player> getTeam1bowler() {
        return team1bowler;
    }

    public List<Player> getTeam2bowler() {
        return team2bowler;
    }

    public ArrayList<Short> getScore() {
        return score;
    }

    public ArrayList<Short> getWickets() {
        return wickets;
    }

    public ArrayList<Short> getBallsbowled() {
        return ballsbowled;
    }

    public short getTeam1Score() {
        return score.get(0);
    }

    public short getTeam2Score() {
        return score.get(1);
    }

    public void setTeam1Score(short a){
        score.set(0, (short) (getTeam1Score()+a));
    }

    public void setTeam2Score(short a){
        score.set(1, (short) (getTeam2Score()+a));
    }

    public short getTeam1wickets() {
        return wickets.get(0);
    }

    public short getTeam2Wickets() {
        return wickets.get(1);
    }

    public void setTeam1Wickets(short a){
        score.set(0, (short) (getTeam1Score()+a));
    }

    public void setTeam2Wickets(short a){
        score.set(1, (short) (getTeam2Score()+a));
    }
    public int bat(){
        return r.nextInt(7);
    }
    public int bowl(){
       return  r.nextInt(7);
    }
    public void write(){

    }
    public void play(){
        Toss toss  = new Toss(t1, t2);
        Team winning = toss.coinFlip();
        if(toss.getChoice().equals("Batting")){

        }
        else if(toss.getChoice().equals("Bowling"){

        }
    }
}
