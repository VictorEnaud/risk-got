import domain.Board;
import domain.House;
import domain.Kingdom;
import usecase.CreateHouseList;
import usecase.CreateKingdomList;
import usecase.InitializeBoard;

import java.util.Map;

public class RiskGot {
    public static void main(String[] args) {
        System.out.println("This is Game of Thrones Risk Edition");

        System.out.println("Creating Houses...");
        Map<String, House> houseList = new CreateHouseList().createHousesList();

        houseList.forEach((houseName, house) -> System.out.println(houseName));

        System.out.println("Creating Kingdoms...");
        Map<String, Kingdom> kingdomList = new CreateKingdomList().createKingdomList();

        System.out.println("Initializing board...");
        Board board = new InitializeBoard().initializeBoard(houseList, kingdomList);
    }
}
