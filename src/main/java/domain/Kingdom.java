package domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kingdom {
    private String name;
    private Set<Kingdom> neighbors;

    public Kingdom(String name) {
        this.name = name;
        this.neighbors = new LinkedHashSet<>();
    }

    public void addNeighbor(Kingdom neighbor) {
        this.neighbors.add(neighbor);
    }

    public String getName() {
        return name;
    }

    public Set<Kingdom> getNeighbors() {
        return neighbors;
    }
}
