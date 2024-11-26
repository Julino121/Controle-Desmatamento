import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        String serverAddress = "localhost";  // Endereço do servidor
        int serverPort = 12345;  // Porta do servidor

        try {
            // Conecta no servidor
            Socket socket = new Socket(serverAddress, serverPort);
            System.out.println("Conectado ao servidor: " + serverAddress + ":" + serverPort);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Recebe dados do servidor
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            // Encerra a conexao
            socket.close();
            System.out.println("Conexão com o servidor encerrada.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
