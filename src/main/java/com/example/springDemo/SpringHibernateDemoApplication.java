package com.example.springDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springDemo.service.SoccerService;

@SpringBootApplication
public class SpringHibernateDemoApplication implements CommandLineRunner {

	@Autowired
	private SoccerService soccerService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		soccerService.addGermanyTeamPLayer("Lucas Podolski", "Forward", 44);
	 
		List<String> getTeamPlayers=soccerService.getAllTeamPlayers(1);
		
		for (String player : getTeamPlayers) {
			System.out.println("Introducing Germany Player :"+player);
		}
	
	}

	
	
	
}
