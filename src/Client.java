import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Conecta-se ao servidor na porta 12345
            Socket socket = new Socket("localhost", 12345);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Conectado ao servidor. Digite seus comandos.");

            String command;
            while (true) {
                System.out.print("Comando: ");
                command = userInput.readLine();

                out.println(command); // Envia o comando para o servidor

                String response;
                while ((response = in.readLine()) != null) {
                    System.out.println(response); // Exibe a resposta do servidor
                    if (response.contains("Conexão encerrada")) {
                        break;
                    }
                }

                if (command.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }

            // Fecha a conexão
            in.close();
            out.close();
            userInput.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
