import domain.Board;
import domain.House;
import domain.Kingdom;
import usecase.CreateHouseList;
import usecase.CreateKingdomList;
import usecase.InitializeBoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class RiskGot {
    public static void main(String[] args) throws IOException {
        System.out.println("This is Game of Thrones Risk Edition");

        System.out.println("Creating Houses...");
        Map<String, House> houseList = new CreateHouseList().createHousesList();

        System.out.println("Creating Kingdoms...");
        Map<String, Kingdom> kingdomList = new CreateKingdomList().createKingdomList();

        System.out.println("Initializing board...");
        Board board = new InitializeBoard().initializeBoard(houseList, kingdomList);

        System.out.println("Pick a side...");
        boolean isPickingHouse = true;
        while (isPickingHouse) {
            try {
                playerPickHouse(houseList);
                isPickingHouse = false;
            } catch (NullPointerException e) {
                System.out.println("This house does not exist, please pick again");
            }
        }
    }

    private static void playerPickHouse(Map<String, House> houseList) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String chosenHouse = br.readLine();
        houseList.get(chosenHouse).chosenByPlayer();
    }
}
