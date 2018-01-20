package domain;

import java.util.Map;

public class Board {
    private Map<String, House> houseList;
    private Map<String, Kingdom> kingdomList;

    public Board(Map<String, House> houseList, Map<String, Kingdom> kingdomList) {
        this.houseList = houseList;
        this.kingdomList = kingdomList;
    }

    public Map<String, House> getHouseList() {
        return houseList;
    }

    public Map<String, Kingdom> getKingdomList() {
        return kingdomList;
    }
}
