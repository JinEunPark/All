package fortheTest.observe;

public class CurrentConditionsDisplay implements Observer, DisPlayElement {

    private double temperature;
    private double humidity;
    private double pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);//현재 자신의 객체를 전달해서 subject에 등록을함 원래 observer에서 자기 자신을 등록하는게 맞는거임
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 "+temperature+"F ,습도 "+humidity+"% 압력: "+pressure);

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
