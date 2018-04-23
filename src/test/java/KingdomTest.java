import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KingdomTest {
    @Test
    void shouldBeCreatedWithAName_onInit() {
        // Given
        String name = "Kingdom name";

        // When
        Kingdom kingdom = new Kingdom(name, "House");

        // Then
        assertThat(kingdom.getName()).isEqualTo(name);
    }

    @Test
    void shouldBeCreatedWithAnOwner_onInit() {
        // Given
        String owner = "House";

        // When
        Kingdom kingdom = new Kingdom("Kingdom name", owner);

        // Then
        assertThat(kingdom.getOwner()).isEqualTo(owner);
    }

    @Test
    void shouldBeCreatedWithOneArmy_onInit() {
        // When
        Kingdom kingdom = new Kingdom("Kingdom name", "House");

        // Then
        assertThat(kingdom.getArmies()).isEqualTo(1);
    }
}