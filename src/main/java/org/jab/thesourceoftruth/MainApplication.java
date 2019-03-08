package org.jab.thesourceoftruth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LOGGER.info("EXECUTING : command line runner");

		for (int i = 0; i < args.length; ++i) {
			LOGGER.info("args[{}]: {}", i, args[i]);
		}
	}

}