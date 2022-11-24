package lastTest.CommandPattern.lightControl;

public class RemoteControlTest {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();
        //많은 클래스들을 한번에 제어할 수 있는 객체
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        //제어 대상
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        OpenGarageDoorCommand openGarageDoorCommand = new OpenGarageDoorCommand(garageDoor);
        //제어 대상을 제어하는 command객체
//        remoteControl.setCommand(lightOnCommand);
//        //총컨트롤 타워에서 command class를 제어할 수 있도록 의존성을 주입함.
//        remoteControl.buttonWasPressed();
//        remoteControl.setCommand(openGarageDoorCommand);
//        remoteControl.buttonWasPressed();
        //정해진 슬롯에 있는 명령을 실행함.
    }

}
