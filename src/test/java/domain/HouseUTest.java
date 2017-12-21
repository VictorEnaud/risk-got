package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HouseUTest {
    @Test
    public void shouldNotEquals_whenTwoHousesOfDifferentNames() throws Exception {
        // When
        House houseArryn = new House("Arryn");
        House houseBaratheon = new House("Baratheon");

        // Then
        assertThat(houseArryn).isNotEqualTo(houseBaratheon);
    }

    @Test
    public void shouldEquals_whenTwoHousesOfSameName() throws Exception {
        // When
        House houseArryn1 = new House("Arryn");
        House houseArryn2 = new House("Arryn");

        // Then
        assertThat(houseArryn1).isEqualTo(houseArryn2);
    }

    @Test
    public void shouldHaveSameHashcode_whenTwoHousesOfSameName() throws Exception {
        // When
        House houseArryn1 = new House("Arryn");
        House houseArryn2 = new House("Arryn");

        // Then
        assertThat(houseArryn1.hashCode()).isEqualTo(houseArryn2.hashCode());
    }
}