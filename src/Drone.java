import java.util.Random;

public class Drone {
    private String region;
    private double areaDesmatada;
    private double areaVerde;

    public Drone(String region) {
        this.region = region;
        generateRandomAreas();
    }

    private void generateRandomAreas() {
        Random random = new Random();

        this.areaDesmatada = 50 + (500 - 50) * random.nextDouble();
        this.areaVerde = 1000 + (10000 - 1000) * random.nextDouble();
    }

    public void detectDesmatamento() {
        System.out.println("Drone detectou " + areaDesmatada + " km² de desmatamento na região: " + region);
        System.out.println("Drone verificou " + areaVerde + " km² de área verde na região: " + region);
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
