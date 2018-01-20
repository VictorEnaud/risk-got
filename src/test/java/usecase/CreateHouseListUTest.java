package usecase;

import domain.House;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateHouseListUTest {
    @Test
    public void shouldCreateSetOf8Houses() {
        // Given
        CreateHouseList createHouseList = new CreateHouseList();

        // When
        Set<House> houseSet = createHouseList.createHousesList();

        // Then
        assertThat(houseSet).hasSize(8);
    }
}