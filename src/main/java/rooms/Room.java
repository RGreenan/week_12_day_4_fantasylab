package rooms;

import players.Player;

import java.util.ArrayList;

public abstract class Room {
    protected ArrayList<Player> players;
    private String name;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
