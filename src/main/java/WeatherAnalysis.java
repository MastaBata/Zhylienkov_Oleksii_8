public class WeatherAnalysis {
    public static void main(String[] args) {
        try {
            Thread temperatureThread = new Thread(new TemperatureAnalysis());
            temperatureThread.start();
            temperatureThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}