import java.util.Random;

public class Satellite {
    private String region;
    private double areaDesmatada;
    private double areaVerde;


    public Satellite(String region) {
        this.region = region;
        generateRandomAreas();
    }

    private void generateRandomAreas() {
        Random random = new Random();

        this.areaDesmatada = 50 + (500 - 50) * random.nextDouble();
        this.areaVerde = 1000 + (10000 - 1000) * random.nextDouble();
    }

    public void captureImage() {
        System.out.println("Satélite capturou uma imagem com " + areaDesmatada + " km² de desmatamento na região: " + region);
        System.out.println("Satélite verificou " + areaVerde + " km² de área verde na região: " + region);
    }

    public String getRegion() {
        return region;
    }

    public double getAreaDesmatada() {
        return areaDesmatada;
    }

    public double getAreaVerde() {
        return areaVerde;
    }
}
