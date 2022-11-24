package com.shiva.generics.why;

import java.util.ArrayList;
import java.util.List;

public class Team {

	String name;
	List<Player> players = new ArrayList<>();

	public Team(String name) {
		this.name=name;
	}

	void addMember(Player player) {
		players.add(player);
	}

	public int numOfPlayers() {
		return players.size();
	}

}
