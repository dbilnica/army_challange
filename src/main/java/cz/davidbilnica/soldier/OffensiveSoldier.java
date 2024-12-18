package cz.davidbilnica.soldier;

import commands.Fight;

public class OffensiveSoldier extends AbstractSoldier implements Fight {
    public OffensiveSoldier(String name, int damage) {
        super("Offensive Soldier", name, damage);
    }

    @Override
    public void fight() {
        System.out.println(getReport() + " is fighting!");
    }
}
