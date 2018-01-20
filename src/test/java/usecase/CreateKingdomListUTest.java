package usecase;

import domain.Kingdom;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateKingdomListUTest {
    @Test
    public void shouldCreateMapOf8Kingdoms() {
        // Given
        CreateKingdomList createKingdomList = new CreateKingdomList();

        // When
        Map<String, Kingdom> kingdomList = createKingdomList.createKingdomList();

        // Then
        assertThat(kingdomList).hasSize(8);
    }
}