package wholeApp.mainApp;

import java.sql.*;

public class DataRetriever {
    public static WeatherData dataRetriever(Inputs inputdata) {

        WeatherData weatherData = new WeatherData();

        String DB_URL = "jdbc:mysql://localhost:3306/weather_app";
        String DB_USER = "root";
        String DB_PASS = "";

        try {
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM weather_data WHERE location = ? AND forecast_time = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            String location = inputdata.getLocation();
            String forecastTime = inputdata.getDateTime();

            stmt.setString(1, location);

            stmt.setTimestamp(2, Timestamp.valueOf(forecastTime));

            ResultSet rs = stmt.executeQuery();

            String weatherCondition = null;
            if (rs.next()) {

                weatherData.setRainProbability(rs.getDouble("rain_probability"));
                weatherData.setWindSpeed(rs.getDouble("wind_speed"));
                weatherData.setVisibility(rs.getInt("visibility"));
                weatherCondition = rs.getString("weather_condition");
                weatherData.setLightning(weatherCondition.contains("thunder"));
                weatherData.setStorms(weatherCondition.contains("storm"));

            } else {
                return null; // No data found for the given location and time

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return weatherData;
    }
}
