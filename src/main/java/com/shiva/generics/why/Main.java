package com.shiva.generics.why;

public class Main {

	public static void main(String[] args) {
       BaseballPlayer bp = new BaseballPlayer("Player1");
       SoccerPlayer sp = new SoccerPlayer("Player2");
       Team team =  new Team("Check");
       //FIXME : No Check on Types we add in the Team,we can add Baseball Player and Soccer Player in the same team without checks
       team.addMember(bp);
       team.addMember(sp);
       System.out.println("Players in Team "+team.numOfPlayers());
	}
}
