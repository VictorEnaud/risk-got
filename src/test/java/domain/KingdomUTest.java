package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KingdomUTest {
    @Test
    public void shouldAddNeighbor() {
        // Given
        Kingdom kingdom = new Kingdom("Kingdom");
        Kingdom neighbor = new Kingdom("Neighbor");

        // When
        kingdom.addNeighbor(neighbor);

        // Then
        assertThat(kingdom.getNeighbors()).hasSize(1)
                .contains(neighbor);
    }
}