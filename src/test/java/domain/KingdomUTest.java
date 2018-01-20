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

    @Test
    public void shouldNotEquals_whenTwoKingdomsOfDifferentNames() throws Exception {
        // When
        Kingdom northKingdom = new Kingdom("North");
        Kingdom riverlandsKingdom = new Kingdom("Riverlands");

        // Then
        assertThat(northKingdom).isNotEqualTo(riverlandsKingdom);
    }

    @Test
    public void shouldEquals_whenTwoKingdomsOfSameName() throws Exception {
        // When
        Kingdom northKingdom1 = new Kingdom("North");
        Kingdom northKingdom2 = new Kingdom("North");

        // Then
        assertThat(northKingdom1).isEqualTo(northKingdom2);
    }

    @Test
    public void shouldHaveSameHashcode_whenTwoKingdomsOfSameName() throws Exception {
        // When
        Kingdom northKingdom1 = new Kingdom("North");
        Kingdom northKingdom2 = new Kingdom("North");

        // Then
        assertThat(northKingdom1.hashCode()).isEqualTo(northKingdom2.hashCode());
    }
}