package domain;

import java.util.Objects;

public class House {
    private String name;

    public House(String name) {
        this.name = name;
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
}
