package usecase;

import domain.House;

import java.util.HashMap;
import java.util.Map;

public class CreateHouseList {
    public Map<String, House> createHousesList() {
        HashMap<String, House> houseList = new HashMap<>();

        House houseArryn = new House("Arryn");
        House houseBaratheon = new House("Baratheon");
        House houseLannister = new House("Lannister");
        House houseMartell = new House("Martell");
        House houseStark = new House("Stark");
        House houseTargaryen = new House("Targaryen");
        House houseTully = new House("Tully");
        House houseTyrell = new House("Tyrell");

        houseList.put(houseArryn.getName(), houseArryn);
        houseList.put(houseBaratheon.getName(), houseBaratheon);
        houseList.put(houseLannister.getName(), houseLannister);
        houseList.put(houseMartell.getName(), houseMartell);
        houseList.put(houseStark.getName(), houseStark);
        houseList.put(houseTargaryen.getName(), houseTargaryen);
        houseList.put(houseTully.getName(), houseTully);
        houseList.put(houseTyrell.getName(), houseTyrell);

        return houseList;
    }
}
