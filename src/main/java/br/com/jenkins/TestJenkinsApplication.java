package br.com.jenkins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.jenkins.main.Main;

@SpringBootApplication
public class TestJenkinsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main.main(args);
	}

}
