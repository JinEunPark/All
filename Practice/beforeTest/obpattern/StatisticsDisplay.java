package beforeTest.obpattern;

public class StatisticsDisplay implements Observer,DisplayElement{

    private double temperature;
    private double humidity;
    private double pressure;
    Subject subject;

    public StatisticsDisplay(Subject subject){
        this.subject = subject;

    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: temperature: "+temperature+" humidity: "+humidity+ " pressure: "+pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
