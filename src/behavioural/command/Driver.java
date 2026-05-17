package behavioural.command;

public class Driver {
    public static void main(String[] args) {
        Appliance ac = new AC();
        Appliance light = new Light();

        Command lightOn = new ApplianceOnCommand(light);
        Command lightOff = new ApplianceOffCommand(light);
        Command acOn = new ApplianceOnCommand(ac);
        Command acOff = new ApplianceOffCommand(ac);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(0,lightOn);
        remote.setCommand(1,lightOff);
        remote.setCommand(2,acOn);
        remote.setCommand(3,acOff);

        remote.pressButton(0); // Light ON
        remote.pressButton(2); // AC ON
        remote.pressButton(1); // Light OFF
        remote.pressUndo();    // Undo Light OFF -> Light ON
        remote.pressUndo();    // Undo AC ON -> AC OFF
    }
}
