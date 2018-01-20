package usecase;

import domain.Board;
import domain.House;
import domain.Kingdom;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class InitializeBoardUTest {

    private InitializeBoard initializeBoard = new InitializeBoard();
    private Map<String, House> houseList = new CreateHouseList().createHousesList();
    private Map<String, Kingdom> kingdomList = new CreateKingdomList().createKingdomList();

    @Test
    public void shouldReturnBoardWithGivenHouseList() {
        // When
        Board board = initializeBoard.initializeBoard(houseList, kingdomList);

        // Then
        assertThat(board.getHouseList()).isSameAs(houseList);
    }

    @Test
    public void shouldReturnBoardWithGivenKingdomList() {
        // When
        Board board = initializeBoard.initializeBoard(houseList, kingdomList);

        // Then
        assertThat(board.getKingdomList()).isSameAs(kingdomList);
    }

    @Test
    public void shouldInitializeNorthKingdomWithNeighborsAndController() {
        // When
        Board board = initializeBoard.initializeBoard(houseList, kingdomList);

        // Then
        Kingdom northKingdom = board.getKingdomList().get("North");
        assertThat(northKingdom.getController()).isSameAs(houseList.get("Stark"));
        assertThat(northKingdom.getNeighbors()).containsExactly(kingdomList.get("Riverlands"));
    }
}