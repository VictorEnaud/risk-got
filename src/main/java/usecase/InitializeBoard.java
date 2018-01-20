package usecase;

import domain.Board;
import domain.House;
import domain.Kingdom;

import java.util.Map;

public class InitializeBoard {
    public Board initializeBoard(Map<String, House> houseList, Map<String, Kingdom> kingdomList) {
        setControllers(houseList, kingdomList);
        setNeighbors(kingdomList);


        return new Board(houseList, kingdomList);
    }

    private void setControllers(Map<String, House> houseList, Map<String, Kingdom> kingdomList) {
        kingdomList.get("Crownlands").setController(houseList.get("Targaryen"));
        kingdomList.get("Dorne").setController(houseList.get("Martell"));
        kingdomList.get("North").setController(houseList.get("Stark"));
        kingdomList.get("Reach").setController(houseList.get("Tyrell"));
        kingdomList.get("Riverlands").setController(houseList.get("Tully"));
        kingdomList.get("Stormlands").setController(houseList.get("Baratheon"));
        kingdomList.get("Vale").setController(houseList.get("Arryn"));
        kingdomList.get("Westerlands").setController(houseList.get("Lannister"));
    }

    private void setNeighbors(Map<String, Kingdom> kingdomList) {
        kingdomList.get("Crownlands").addNeighbor(kingdomList.get("Reach"));
        kingdomList.get("Crownlands").addNeighbor(kingdomList.get("Riverlands"));
        kingdomList.get("Crownlands").addNeighbor(kingdomList.get("Stormlands"));

        kingdomList.get("Dorne").addNeighbor(kingdomList.get("Reach"));
        kingdomList.get("Dorne").addNeighbor(kingdomList.get("Stormlands"));

        kingdomList.get("North").addNeighbor(kingdomList.get("Riverlands"));

        kingdomList.get("Reach").addNeighbor(kingdomList.get("Dorne"));
        kingdomList.get("Reach").addNeighbor(kingdomList.get("Crownlands"));
        kingdomList.get("Reach").addNeighbor(kingdomList.get("Riverlands"));
        kingdomList.get("Reach").addNeighbor(kingdomList.get("Stormlands"));
        kingdomList.get("Reach").addNeighbor(kingdomList.get("Westerlands"));

        kingdomList.get("Riverlands").addNeighbor(kingdomList.get("Crownlands"));
        kingdomList.get("Riverlands").addNeighbor(kingdomList.get("North"));
        kingdomList.get("Riverlands").addNeighbor(kingdomList.get("Vale"));
        kingdomList.get("Riverlands").addNeighbor(kingdomList.get("Reach"));
        kingdomList.get("Riverlands").addNeighbor(kingdomList.get("Westerlands"));

        kingdomList.get("Stormlands").addNeighbor(kingdomList.get("Dorne"));
        kingdomList.get("Stormlands").addNeighbor(kingdomList.get("Crownlands"));
        kingdomList.get("Stormlands").addNeighbor(kingdomList.get("Reach"));

        kingdomList.get("Vale").addNeighbor(kingdomList.get("Riverlands"));

        kingdomList.get("Westerlands").addNeighbor(kingdomList.get("Reach"));
        kingdomList.get("Westerlands").addNeighbor(kingdomList.get("Riverlands"));
    }
}
