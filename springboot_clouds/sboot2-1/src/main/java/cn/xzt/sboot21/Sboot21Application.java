package cn.xzt.sboot21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sboot21Application {

    public static void main(String[] args) {
        SpringApplication.run(Sboot21Application.class, args);
    }
}
