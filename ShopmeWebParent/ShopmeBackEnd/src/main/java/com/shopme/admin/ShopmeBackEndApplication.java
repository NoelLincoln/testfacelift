package com.shopme.admin;

import com.shopme.common.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import com.shopme.admin.user.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
@EntityScan({"com.shopme.common.entity"})
public class ShopmeBackEndApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(ShopmeBackEndApplication.class);

	private final UserRepository repository;

	public ShopmeBackEndApplication(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
//        repository.deleteAll();


//		String password= "qwertyui";
//		BCryptPasswordEncoder encod = new BCryptPasswordEncoder();
//		String pswd = encod.encode(password);
//
//		System.out.println("encoded password :" + pswd );



//		repository.save(new User("noel@gmail.com", "$2a$10$wPGo1rGgk04qlxRhogzCiu3IW8yrod8zCM4lAf2nO7ulPCGq4ukjC","Bryant", "Noel", true));


		repository.findAll().forEach((user) -> {
			logger.info("{}", user);
		});
	}


	public static void main(String[] args) {
		SpringApplication.run(ShopmeBackEndApplication.class, args);
	}

}
