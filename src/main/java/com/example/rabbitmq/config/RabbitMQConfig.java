package com.example.rabbitmq.config;

import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQConfig {

    public static ConnectionFactory getConnectionFactory() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("guest");  // Usar 'guest' como usuário
        factory.setPassword("guest");  // Usar 'guest' como senha
        factory.setVirtualHost("/");   // Virtual host padrão
        return factory;
    }
}