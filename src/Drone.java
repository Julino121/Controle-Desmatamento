import java.util.Random;

public class Drone {


    public static String EscanearArea(String region) {
        Random random = new Random();
        double areaDesmatada = 50 + (500 * random.nextDouble());
        double areaVerde = 1000 + (10000 * random.nextDouble());



        String formattedDesmatada = String.format("%.1f", areaDesmatada);
        String formattedVerde = String.format("%.1f", areaVerde);

        return "Drone - " + region + ": " + formattedDesmatada + " km² de desmatamento, " + formattedVerde + " km² de área verde.";
    }
}
