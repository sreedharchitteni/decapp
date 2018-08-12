package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@EnableAutoConfiguration
//@Configuration
//@EnableWebMvc
@ComponentScan
/*This is the initializer*/
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
