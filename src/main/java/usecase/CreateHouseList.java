package usecase;

import domain.House;

import java.util.LinkedHashSet;
import java.util.Set;

public class CreateHouseList {
    public Set<House> createHousesList() {
        LinkedHashSet<House> houseSet = new LinkedHashSet<>();
        houseSet.add(new House("Arryn"));
        houseSet.add(new House("Baratheon"));
        houseSet.add(new House("Lannister"));
        houseSet.add(new House("Martell"));
        houseSet.add(new House("Stark"));
        houseSet.add(new House("Targaryen"));
        houseSet.add(new House("Tully"));
        houseSet.add(new House("Tyrell"));
        return houseSet;
    }
}
