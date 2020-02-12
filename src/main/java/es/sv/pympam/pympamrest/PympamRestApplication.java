package es.sv.pympam.pympamrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = { MongoAutoConfiguration.class,
        MongoDataAutoConfiguration.class//,
        //UserDetailsServiceAutoConfiguration.class
})
public class PympamRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PympamRestApplication.class, args);
    }

}
