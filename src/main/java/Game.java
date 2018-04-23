import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<String> houses;
    private List<Kingdom> kingdoms;

    public Game() {
        this.houses = new ArrayList<>();
        this.houses.add("House 1");
        this.houses.add("House 2");

        this.kingdoms = new ArrayList<>();
        this.kingdoms.add(new Kingdom("Kingdom 1", "House 1"));
        this.kingdoms.add(new Kingdom("Kingdom 2", "House 2"));
    }

    public List<String> getHouses() {
        return houses;
    }

    public List<Kingdom> getKingdoms() {
        return kingdoms;
    }
}