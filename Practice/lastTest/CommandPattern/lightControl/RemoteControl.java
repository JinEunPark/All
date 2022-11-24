package lastTest.CommandPattern.lightControl;

public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;

    Command slot;

    public RemoteControl() {

        this.onCommand = new Command[7];
        this.offCommand = new Command[7];
        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;

    }

    public void buttonWasPressed(int slot) {
        onCommand[slot].execute();
    }

    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n--------reomote controller--------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[slot " + i + "]" + onCommand[i].getClass().getName() + "         " + offCommand[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();

    }
}
