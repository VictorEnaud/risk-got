package usecase;

import domain.House;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateHousesListUTest {
    @Test
    public void shouldCreateSetOf8Houses() {
        // Given
        CreateHousesList createHousesList = new CreateHousesList();

        // When
        Set<House> houseSet = createHousesList.createHousesList();

        // Then
        assertThat(houseSet).hasSize(8);
    }
}