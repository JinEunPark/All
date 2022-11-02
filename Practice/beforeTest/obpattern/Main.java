package beforeTest.obpattern;

public class Main {
    public static void main(String[]args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.registerObserver(currentConditionDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(statisticsDisplay);

        for(int i = 0; i<10; i++){
            weatherData.setMeasurements(i*1,i*2,i*3);
        }

    }
}
