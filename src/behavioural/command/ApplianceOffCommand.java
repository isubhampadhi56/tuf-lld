package behavioural.command;

public class ApplianceOffCommand implements Command{
    private Appliance appliance;
    public ApplianceOffCommand(Appliance appliance){
        this.appliance = appliance;
    }
    @Override
    public void execute() {
        appliance.off();
    }

    @Override
    public void undo() {
        appliance.on();
    }
}
