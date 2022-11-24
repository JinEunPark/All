package lastTest.CommandPattern.lightControl;

public class LightOnCommand implements Command{//command class 니까 command interface구현

    Light light;

    public LightOnCommand(Light light){//생성자에서 제어할 객체를 생성자로 받음.
        this.light = light;
    }

    @Override
    public void execute() {//light 객체 내부에 있는 객체의 on method를 execution함.
        light.on();
    }
}
