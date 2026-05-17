package behavioural.command;

import java.util.Stack;

public class RemoteControl {
    private Command[] buttons;
    private Stack<Command> history;
    public RemoteControl(){
        buttons = new Command[4];
        history = new Stack<>();
    }
    public void setCommand(int slot,Command command){
        buttons[slot] = command;
    }
    public void pressButton(int slot){
        if(buttons[slot] != null){
            buttons[slot].execute();
            history.push(buttons[slot]);
        }else{
            System.out.println("No command assigned to slot " + slot);
        }
    }
    public void pressUndo(){
        if(!history.isEmpty()){
            history.pop().undo();
        }else{
            System.out.println("No commands to undo.");
        }
    }
}
