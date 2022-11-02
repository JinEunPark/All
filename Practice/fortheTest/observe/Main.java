package fortheTest.observe;

public class Main {
    public static void main(String[]args){


        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4);
        weatherData.setMeasurements(82,67,32.4);
        weatherData.setMeasurements(85,68,33.4);
    }
}
