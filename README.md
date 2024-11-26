# Monitoramento de Desmatamento com Drone e Satélite

Este projeto simula o monitoramento de áreas desmatadas e áreas verdes utilizando drones e satélites. O sistema gera valores aleatórios representando as áreas desmatadas e áreas verdes em diferentes regiões e envia esses dados para um servidor. O servidor processa e exibe as informações de desmatamento e áreas verdes.


## Descrição das Classes

### 1. **Client.java**
A classe `Client` é uma simulação de um cliente que se conecta ao servidor. Ela não é usada diretamente na simulação, mas serve para ilustrar a comunicação cliente-servidor.

### 2. **Server.java**
O servidor recebe os dados de desmatamento e áreas verdes de drones e satélites, e exibe essas informações.

- **Método principal**: Inicia o servidor e aguarda os dados dos dispositivos.
- **Recebe dados de drone e satélite**: Armazena e exibe as informações de desmatamento e áreas verdes por região.

### 3. **Drone.java**
A classe `Drone` simula o monitoramento de uma região por drone. Ela gera áreas desmatadas e áreas verdes de forma aleatória.

- **Método `generateRandomAreas()`**: Gera valores aleatórios para áreas desmatadas e áreas verdes.
- **Método `detectDesmatamento()`**: Exibe as áreas desmatadas e verdes para a região monitorada.

### 4. **Satellite.java**
A classe `Satellite` simula o monitoramento de uma região por satélite. Ela também gera dados aleatórios sobre desmatamento e áreas verdes.

- **Método `generateRandomAreas()`**: Gera valores aleatórios para áreas desmatadas e áreas verdes.
- **Método `captureImage()`**: Exibe os dados de desmatamento e áreas verdes da região monitorada.

### 5. **MonitoramentoSimulador.java**
A classe `MonitoramentoSimulador` cria instâncias de drone e satélite, gera dados aleatórios e envia esses dados para o servidor.

- **Método `main()`**: Inicia o processo de monitoramento e envia os dados ao servidor.

