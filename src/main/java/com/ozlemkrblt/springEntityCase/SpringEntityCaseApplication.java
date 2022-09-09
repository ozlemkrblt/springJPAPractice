package com.ozlemkrblt.springEntityCase;

import com.ozlemkrblt.springEntityCase.Model.Kullanici;
import com.ozlemkrblt.springEntityCase.Model.KullaniciRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@EntityScan
@SpringBootApplication
public class SpringEntityCaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEntityCaseApplication.class, args);
	}

	@Bean
	CommandLineRunner cmd(KullaniciRepository kullaniciRepository) {
		return args -> {
			Kullanici ozlem = new Kullanici
					("Özlem", "Karabulut", "ozlemkrblt99@gmail.com", "+90 554 6890201");
			kullaniciRepository.save(ozlem);
		};
	}
}
