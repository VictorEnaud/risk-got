package usecase;

import domain.House;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateHouseListUTest {
    @Test
    public void shouldCreateMapOf8Houses() {
        // Given
        CreateHouseList createHouseList = new CreateHouseList();

        // When
        Map<String, House> houseList = createHouseList.createHousesList();

        // Then
        assertThat(houseList).hasSize(8);
    }
}