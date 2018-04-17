import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    @Test
    void shouldCreateTwoPlayers_onInit() {
        // When
        Game game = new Game();

        // Then
        assertThat(game.getPlayers()).hasSize(2);
    }

    @Test
    void shouldCreateTwoKingdoms_onInit() {
        // When
        Game game = new Game();

        // Then
        assertThat(game.getKingdoms()).hasSize(2);
    }
}