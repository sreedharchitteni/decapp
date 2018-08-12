package hello;

import org.springframework.context.annotation.Bean;

public class JavConfig {
	@Bean
    public String emailText() {
    	System.out.println("Loaded Email Bean................");
    	return "%s fuck off......";
    }
}
