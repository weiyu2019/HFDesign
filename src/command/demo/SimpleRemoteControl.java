package command.demo;

public class SimpleRemoteControl {
    Command slot;
    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);

        remote.setCommand(command);
        remote.buttonWasPressed();
    }
}
