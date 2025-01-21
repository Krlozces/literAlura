package com.challenge.literalura;

import com.challenge.literalura.main.Main;
import com.challenge.literalura.repository.IAuthorRepository;
import com.challenge.literalura.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
	@Autowired
	private IBookRepository iBookRepository;
	private IAuthorRepository iAuthorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(iBookRepository, iAuthorRepository);
		main.showMenu();
	}
}
