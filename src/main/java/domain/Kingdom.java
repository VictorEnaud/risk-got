package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Kingdom {
    private String name;
    private House controller;
    private Set<Kingdom> neighbors;

    public Kingdom(String name) {
        this.name = name;
        this.neighbors = new LinkedHashSet<>();
    }

    public void addNeighbor(Kingdom neighbor) {
        this.neighbors.add(neighbor);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kingdom kingdom = (Kingdom) object;
        return Objects.equals(name, kingdom.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public String getName() {
        return name;
    }

    public Set<Kingdom> getNeighbors() {
        return neighbors;
    }

    public House getController() {
        return controller;
    }

    public void setController(House controller) {
        this.controller = controller;
    }
}
