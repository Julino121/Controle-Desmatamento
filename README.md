# Projeto de Controle de Área de Desmatamento - Cliente-Servidor

Este projeto simula um sistema de monitoramento de desmatamento usando um modelo cliente-servidor em Java. O servidor gera dados de desmatamento e áreas verdes utilizando simulações com as classes `Drone` e `Satellite`, enquanto o cliente se conecta ao servidor e exibe os dados recebidos.


## Descrição das Classes

### `Server.java`

- Espera a conexão do cliente.
- Gera dados de desmatamento e áreas verdes usando as classes `Drone` e `Satellite`.
- Envia esses dados para o cliente.

### `Client.java`

- Se conecta ao servidor.
- Recebe e exibe os dados de desmatamento e áreas verdes enviados pelo servidor.

### `Drone.java`

- Simula um drone que gera dados de desmatamento e áreas verdes.
- Gera valores aleatórios para áreas desmatadas e áreas verdes.

### `Satellite.java`

- Simula um satélite que gera dados de desmatamento e áreas verdes.
- Gera valores aleatórios para áreas desmatadas e áreas verdes.



