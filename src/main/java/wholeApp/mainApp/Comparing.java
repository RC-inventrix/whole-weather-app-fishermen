package wholeApp.mainApp;

public class Comparing {

    public static int compare(WeatherData data) {

        if (data.getRainProbability() > 70 || data.getWindSpeed() > 50 || data.isStorms()
                || data.getVisibility() < 1000
                || data.isLightning()) {
            return -1;

        } else {
            return 1;
        }
    }
}
