package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by WagnerMestrinho on 2/3/17.
 */

@SpringBootApplication
@ComponentScan(basePackages = "springboot")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);


    }

}
