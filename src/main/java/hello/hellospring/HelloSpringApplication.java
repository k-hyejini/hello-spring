package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        // 내장된 tomcat을 띄우면서 Spring Boot 실행
        SpringApplication.run(HelloSpringApplication.class, args);
    }

}
