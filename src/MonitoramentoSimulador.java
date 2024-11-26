public class MonitoramentoSimulador {
    public static void main(String[] args) {
        // Cria um servidor
        Server server = new Server();

        // Cria alguns drones e satélites com dados aleatórios
        Drone drone1 = new Drone("Amazônia");
        Satellite satellite1 = new Satellite("Pantanal");

        // O servidor recebe os dados do drone e do satélite
        Server.receiveDroneData(drone1);
        Server.receiveSatelliteData(satellite1);
    }
}
