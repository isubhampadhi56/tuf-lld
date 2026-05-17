package behavioural.command;

public class Light implements Appliance{
    @Override
    public void on() {
        System.out.println("Light has been turned on");
    }

    @Override
    public void off() {
        System.out.println("Light has been turned off");
    }
}
