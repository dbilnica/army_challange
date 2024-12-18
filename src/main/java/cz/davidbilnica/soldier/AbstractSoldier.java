package cz.davidbilnica.soldier;

public abstract class AbstractSoldier{
    private String type;
    private final String name;
    private final int damage;

    public AbstractSoldier(String type, String name, int damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    public String getReport() {
        return this.type + " - " + this.name + " with " + this.damage + " damage";
    }
}
