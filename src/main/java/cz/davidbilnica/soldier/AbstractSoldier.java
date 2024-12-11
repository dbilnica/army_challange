package cz.davidbilnica.soldier;

public abstract class AbstractSoldier {
    private String type;
    private final String name;
    private int damage;

    public AbstractSoldier(String type, String name, int damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    public void printReport() {
        System.out.println(this.type + " - " + this.name);
    }
}
