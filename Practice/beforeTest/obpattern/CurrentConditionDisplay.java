package beforeTest.obpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CurrentConditionDisplay implements Observer, DisplayElement{

    private double temperature;
    private double humidity;
    private double pressure;
    Subject subject;

    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay: temperature: "+temperature+" humidity: "+humidity+ " pressure: "+pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure= pressure;
        display();

    }
}
