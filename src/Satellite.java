import java.util.Random;

public class Satellite {


    public static String EscanearArea(String region) {
        Random random = new Random();
        double areaDesmatada = 100 + (400 * random.nextDouble());  // Área desmatada entre 100 e 400 km²
        double areaVerde = 2000 + (8000 * random.nextDouble());  // Área verde entre 2000 e 8000 km²


        String formattedDesmatada = String.format("%.1f", areaDesmatada);
        String formattedVerde = String.format("%.1f", areaVerde);

        return "Satélite - " + region + ": " + formattedDesmatada + " km² de desmatamento, " + formattedVerde + " km² de área verde.";
    }
}
