package 观察者模式;

public class TestClass {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer display1 = new Display1(weatherData);
        Observer display2 = new Display2(weatherData);
        weatherData.setMsg("hello observers");

        NWeatherData nweatherData = new NWeatherData();
        NDisplay1 ndisplay1 = new NDisplay1(nweatherData);
        NDisplay2 ndisplay2 = new NDisplay2(nweatherData);
        nweatherData.setMsg("hello nobservers");
    }

}
