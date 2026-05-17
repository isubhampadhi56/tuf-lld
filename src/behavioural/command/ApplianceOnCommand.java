package behavioural.command;

public class ApplianceOnCommand implements Command{
    private Appliance appliance;
    public ApplianceOnCommand(Appliance appliance){
        this.appliance = appliance;
    }
    @Override
    public void execute() {
        appliance.on();
    }

    @Override
    public void undo() {
        appliance.off();
    }
}
