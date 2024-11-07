package com.corgi.challengeAlura;

import com.corgi.challengeAlura.main.App;
import com.corgi.challengeAlura.repository.AutorRepo;
import com.corgi.challengeAlura.repository.LibrosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeAluraApplication implements CommandLineRunner {

	@Autowired
	private LibrosRepo librosRepo;

	@Autowired
	private AutorRepo autorRepo;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		App app = new App(librosRepo, autorRepo);
		app.iniciarPrograma();
	}
}
