package cz.davidbilnica;

public abstract class AbstractSoldier {
    private String type;
    private String name;
    private String damage;

    public AbstractSoldier(String type, String name, String damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    public void printReport() {
        System.out.println(this.type + " - " + this.name);
    }
}
