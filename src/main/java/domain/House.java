package domain;

import java.util.Objects;

public class House {
    private String name;
    private boolean isPlayer;

    public House(String name) {
        this.name = name;
        this.isPlayer = false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        House house = (House) object;
        return Objects.equals(name, house.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public String getName() {
        return name;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    public void chosenByPlayer() {
        this.isPlayer = true;
    }
}
