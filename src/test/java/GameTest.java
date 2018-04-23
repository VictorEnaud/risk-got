import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    @Test
    void shouldCreateTwoHouses_onInit() {
        // When
        Game game = new Game();

        // Then
        assertThat(game.getHouses()).hasSize(2);
    }

    @Test
    void shouldCreateTwoKingdoms_onInit() {
        // When
        Game game = new Game();

        // Then
        assertThat(game.getKingdoms()).hasSize(2);
        assertThat(game.getKingdoms().get(0)).isInstanceOf(Kingdom.class);
    }
}