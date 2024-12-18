package cz.davidbilnica.soldier;

import commands.Defend;
import commands.Surrender;

public class DefensiveSoldier extends AbstractSoldier implements Defend {
    public DefensiveSoldier(String name, int damage) {
        super("Defensive Soldier", name, damage);
    }

    @Override
    public void defend() {
        System.out.println(getReport() + " is defending!");
    }
}
