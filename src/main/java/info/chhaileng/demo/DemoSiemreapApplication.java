package info.chhaileng.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSiemreapApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSiemreapApplication.class, args);
		
		PetSaying p = context.getBean(PetSaying.class);
		p.saying();
	}
}
