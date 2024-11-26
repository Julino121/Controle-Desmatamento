import java.util.Random;

public class Satellite {


    public static String EscanearArea(String region) {
        Random random = new Random();
        double areaDesmatada = 100 + (400 * random.nextDouble());
        double areaVerde = 2000 + (8000 * random.nextDouble());


        String formattedDesmatada = String.format("%.1f", areaDesmatada);
        String formattedVerde = String.format("%.1f", areaVerde);

        return "Satélite - " + region + ": " + formattedDesmatada + " km² de desmatamento, " + formattedVerde + " km² de área verde.";
    }
}
