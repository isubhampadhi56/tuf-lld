package behavioural.command;

public class AC implements Appliance{
    @Override
    public void on() {
        System.out.println("AC has been turned on");
    }

    @Override
    public void off() {
        System.out.println("AC has been turned off");
    }
}
