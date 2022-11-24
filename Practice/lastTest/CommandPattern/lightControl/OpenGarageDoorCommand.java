package lastTest.CommandPattern.lightControl;

public class OpenGarageDoorCommand implements Command {

    GarageDoor garageDoor;

    public OpenGarageDoorCommand(GarageDoor garageDoor) {

        this.garageDoor = garageDoor;

    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
