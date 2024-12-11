package cz.davidbilnica.soldier;

public abstract class AbstractSoldier {
    private final String type;
    private final String name;
    private int damage;

    public AbstractSoldier(String name, int damage) {
        this.type = "Abstract Soldier";
        this.name = name;
        this.damage = damage;
    }

    public void printReport() {
        System.out.println(this.type + " - " + this.name);
    }
}
