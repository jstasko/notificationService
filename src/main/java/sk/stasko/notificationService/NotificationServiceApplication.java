package sk.stasko.notificationService;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sk.stasko.notificationService.mail.MailBeanMappingBuilder;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@Bean
	public DozerBeanMapper mapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.addMapping(new MailBeanMappingBuilder());
		return mapper;
	}
}
