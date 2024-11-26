import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        int port = 12345;

        try {
            // inicia o Servidor
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Servidor iniciado na porta: " + port);


            Socket clientSocket = serverSocket.accept();
            System.out.println("Cliente conectado.");


            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);


            String regionDrone = "Amazônia";
            String regionSatellite = "Mata Atlântica";

            String droneData = Drone.EscanearArea(regionDrone);
            String satelliteData = Satellite.EscanearArea(regionSatellite);

            out.println(droneData);
            out.println(satelliteData);

            //Encerra a conexão
            clientSocket.close();
            System.out.println("Conexão com o cliente encerrada.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
