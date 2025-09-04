package br.com.alura.ecommerce;

import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Properties;

public class FraudeDetectorService {

    public static void main(String[] args) {

        var consumer = new KafkaConsumer<String, String>(properties());
    }

    private static Properties properties() {

    }
}
