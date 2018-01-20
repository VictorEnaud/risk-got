package usecase;

import domain.Kingdom;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateKingdomListUTest {
    @Test
    public void shouldCreateSetOf8Kingdoms() {
        // Given
        CreateKingdomList createKingdomList = new CreateKingdomList();

        // When
        Set<Kingdom> houseSet = createKingdomList.createKingdomList();

        // Then
        assertThat(houseSet).hasSize(8);
    }
}