package cz.davidbilnica;

import cz.davidbilnica.soldier.AbstractSoldier;
import cz.davidbilnica.soldier.AdaptableSoldier;
import cz.davidbilnica.soldier.DefensiveSoldier;
import cz.davidbilnica.soldier.OffensiveSoldier;

import java.util.ArrayList;
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
        for(AbstractSoldier soldier: listOfSoldiers) {
            soldier.printReport();
        }
    }
}
