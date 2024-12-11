package commands;

public class Fight implements Commands{

    @Override
    public void makeCommand() {
        System.out.println("I'm fighting!");
    }
}
