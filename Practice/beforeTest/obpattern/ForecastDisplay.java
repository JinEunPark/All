package beforeTest.obpattern;

public class ForecastDisplay implements DisplayElement,Observer {
    private double temperature;
    private double humidity;
    private double pressure;
    Subject subject;

    public ForecastDisplay(Subject subject){
        this.subject = subject;

    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: temperature: "+temperature+" humidity: "+humidity+ " pressure: "+pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
