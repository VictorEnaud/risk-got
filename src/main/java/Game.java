import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<String> players;
    private List<String> kingdoms;

    public Game() {
        this.players = new ArrayList<>();
        this.players.add("Player 1");
        this.players.add("Player 2");

        this.kingdoms = new ArrayList<>();
        this.kingdoms.add("Kingdom 1");
        this.kingdoms.add("Kingdom 2");
    }

    public List<String> getPlayers() {
        return players;
    }

    public List<String> getKingdoms() {
        return kingdoms;
    }
}