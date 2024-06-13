package com.marvel.marvelapp;

import com.marvel.marvelapp.principal.PrincipalMenu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarvelappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MarvelappApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

		//Aquí van los metodos

		PrincipalMenu menu = new PrincipalMenu();
		menu.muestraMenu();




	}
}
