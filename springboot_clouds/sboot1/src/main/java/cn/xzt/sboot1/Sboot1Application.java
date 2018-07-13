package cn.xzt.sboot1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Sboot1Application {

    public static void main(String[] args) {

        SpringApplication.run(Sboot1Application.class, args);
    }
}
