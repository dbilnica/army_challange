package cz.davidbilnica;

import commands.Defend;
import commands.Fight;
import commands.Surrender;
import cz.davidbilnica.soldier.AbstractSoldier;
import cz.davidbilnica.soldier.AdaptableSoldier;
import cz.davidbilnica.soldier.DefensiveSoldier;
import cz.davidbilnica.soldier.OffensiveSoldier;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractSoldier> listOfSoldiers = List.of(
                new AdaptableSoldier("Jiri", 42),
                new AdaptableSoldier("Adolf", 60),
                new AdaptableSoldier("Franz", 58),
                new DefensiveSoldier("Arnošt", 70),
                new DefensiveSoldier("Karel", 69),
                new DefensiveSoldier("Jiří", 65),
                new OffensiveSoldier("Pepík", 85),
                new OffensiveSoldier("Kvido", 96),
                new OffensiveSoldier("Robert", 93));

        System.out.println("-----REPORT-----");
        for(AbstractSoldier soldier: listOfSoldiers) {
            System.out.println(soldier.getReport());
        }

        System.out.println("-----FIGHTING-----");
        for(AbstractSoldier soldier: listOfSoldiers) {
            if(soldier instanceof Fight) {
                ((Fight) soldier).fight();
            }
        }

        System.out.println("-----SURRENDING-----");
        for (AbstractSoldier soldier: listOfSoldiers) {
            if(soldier instanceof Surrender) {
                ((Surrender) soldier).surrender();
            }
        }

        System.out.println("-----DEFENDING-----");
        for(AbstractSoldier soldier: listOfSoldiers) {
            if(soldier instanceof Defend) {
                ((Defend) soldier).defend();
            }
        }

    }
}
