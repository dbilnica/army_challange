package commands;

public class Surrender implements Commands{
    @Override
    public void makeCommand() {
        System.out.println("I'm surrending");
    }
}
