public class Kingdom {
    private String owner;
    private int armies;
    private String name;

    public Kingdom(String name, String owner) {
        this.armies = 1;
        this.name = name;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public int getArmies() {
        return armies;
    }

    public String getName() {
        return name;
    }
}
