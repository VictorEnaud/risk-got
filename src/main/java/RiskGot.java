import domain.House;
import domain.Kingdom;
import usecase.CreateHouseList;
import usecase.CreateKingdomList;

import java.util.Set;

public class RiskGot {
    public static void main(String[] args) {
        System.out.println("This is Game of Thrones Risk Edition");

        System.out.println("Creating Houses...");
        Set<House> houses = new CreateHouseList().createHousesList();

        System.out.println("Creating Houses...");
        Set<Kingdom> kingdoms = new CreateKingdomList().createKingdomList();
    }
}
