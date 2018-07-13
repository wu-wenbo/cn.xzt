package cn.xzt.sboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class Sboot2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sboot2Application.class, args);
    }
}
