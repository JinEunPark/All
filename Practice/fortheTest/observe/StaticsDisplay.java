package fortheTest.observe;

public class StaticsDisplay implements DisPlayElement,Observer{

    private double pressure;
    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    private double addAllNum;

    public StaticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    private void makeAddAllNum(double temperature, double humidity, double pressure){
        this.addAllNum = (temperature+humidity+pressure)/3;
    }

    @Override
    public void display() {
        System.out.println("for static number = "+this.addAllNum);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        makeAddAllNum(temperature,humidity,pressure);
        display();
    }
}
