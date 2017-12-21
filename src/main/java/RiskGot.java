import domain.House;
import usecase.CreateHousesList;

import java.util.Set;

public class RiskGot {
    public static void main(String[] args) {
        System.out.println("This is Game of Thrones Risk Edition");
        System.out.println("Creating Houses...");

        Set<House> houses = new CreateHousesList().createHousesList();


        System.out.println("Houses created:");
        houses.forEach((house) -> System.out.println("- House " + house.getName()));
    }
}
