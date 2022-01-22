package kr.co.dajsoft.hell0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Hell0Application {

    public static void main(String[] args) {
        SpringApplication.run(Hell0Application.class, args);
    }

}
