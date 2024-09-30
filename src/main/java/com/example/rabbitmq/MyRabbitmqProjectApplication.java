package com.example.rabbitmq;

import com.example.rabbitmq.producer.NewTask;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRabbitmqProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyRabbitmqProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] messageArgs = {"Mensagem de teste com nome completo: Gabriel Xavier Cabral"};
        
        NewTask.main(messageArgs);
    }
}