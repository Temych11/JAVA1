package JCHW7;

import java.io.IOException;
import java.util.ArrayList;

public interface WeatherProvider {

    ArrayList<WeatherResponse> getWeather() throws IOException;

}