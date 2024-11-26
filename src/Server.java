import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static Map<String, Double> areasDesmatadas = new HashMap<>();
    private static Map<String, Double> areasVerdes = new HashMap<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Porta 12345 para escutar conexões
            System.out.println("Servidor iniciado e aguardando conexões...");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Espera por um cliente
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress().getHostAddress());

                // Cria streams de leitura e escrita para a comunicação com o cliente
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String request;
                while ((request = in.readLine()) != null) {

                    String[] command = request.split(" ");
                    if (command[0].equalsIgnoreCase("ADD")) {
                        String region = command[1];
                        double areaDesmatada = Double.parseDouble(command[2]);
                        double areaVerde = Double.parseDouble(command[3]);
                        addAreaDesmatada(region, areaDesmatada, areaVerde);
                        out.println("Área desmatada e área verde registradas com sucesso na região: " + region);
                    } else if (command[0].equalsIgnoreCase("SHOW")) {
                        out.println("Áreas desmatadas e verdes registradas:");
                        for (String region : areasDesmatadas.keySet()) {
                            out.println(region + " - Desmatamento: " + areasDesmatadas.get(region) + " km², Área Verde: " + areasVerdes.get(region) + " km²");
                        }
                    } else if (command[0].equalsIgnoreCase("QUIT")) {
                        out.println("Conexão encerrada.");
                        break;
                    } else {
                        out.println("Comando não reconhecido.");
                    }
                }


                in.close();
                out.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void addAreaDesmatada(String region, double areaDesmatada, double areaVerde) {
        areasDesmatadas.put(region, areasDesmatadas.getOrDefault(region, 0.0) + areaDesmatada);
        areasVerdes.put(region, areasVerdes.getOrDefault(region, 0.0) + areaVerde);
    }


    public static void receiveDroneData(Drone drone) {
        double areaDesmatada = drone.getAreaDesmatada();
        double areaVerde = drone.getAreaVerde();
        String region = drone.getRegion();
        addAreaDesmatada(region, areaDesmatada, areaVerde);
        System.out.println("Dados do drone recebidos: " + areaDesmatada + " km² de desmatamento e " + areaVerde + " km² de área verde na região " + region);
    }


    public static void receiveSatelliteData(Satellite satellite) {
        double areaDesmatada = satellite.getAreaDesmatada();
        double areaVerde = satellite.getAreaVerde();
        String region = satellite.getRegion();
        addAreaDesmatada(region, areaDesmatada, areaVerde);
        System.out.println("Dados do satélite recebidos: " + areaDesmatada + " km² de desmatamento e " + areaVerde + " km² de área verde na região " + region);
    }
}
