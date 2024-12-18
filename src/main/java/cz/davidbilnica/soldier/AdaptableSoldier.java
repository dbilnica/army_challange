package cz.davidbilnica.soldier;

import commands.Defend;
import commands.Fight;
import commands.Surrender;

public class AdaptableSoldier extends AbstractSoldier implements Fight, Defend, Surrender {
    public AdaptableSoldier(String name, int damage) {
        super("Adaptable Soldier", name, damage);
    }

    @Override
    public void defend() {
        System.out.println(getReport() + " is defending!");
    }

    @Override
    public void fight() {
        System.out.println(getReport() + " is fighting!");
    }

    @Override
    public void surrender() {
        System.out.println(getReport() + " is surrending!");
    }
}
