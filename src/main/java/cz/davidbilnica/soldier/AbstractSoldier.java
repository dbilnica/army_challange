package cz.davidbilnica.soldier;

import commands.Commands;

public abstract class AbstractSoldier{
    private String type;
    private final String name;
    private final int damage;
    private Commands command;

    public AbstractSoldier(String type, String name, int damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    public String getReport() {
        return this.type + " - " + this.name + " with " + this.damage + " damage";
    }

    public void setCommands(Commands command) {
        this.command = command;
    }

    public void executeCommand() {
        if(command != null) {
            System.out.println(getReport() + " " + command.makeCommand());
        } else{
            System.out.println(getReport() + " has no special commands setted!");
        }
    }
}
