package com.example.springDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springDemo.model.Player;
import com.example.springDemo.model.Team;
import com.example.springDemo.repository.PlayerRepository;
import com.example.springDemo.repository.TeamRepository;

@Service
public class SoccerServiceImpl implements SoccerService {

	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private TeamRepository teamRepository;
	
	public List<String> getAllTeamPlayers(long teamId) {
		List<String> result=new ArrayList<String>();
		List<Player> player= playerRepository.findByTeamId(teamId);
		
		for (Player player2 : player) {
			result.add(player2.getName());
		}
		
		
		return result;
	}

	
	public void addGermanyTeamPLayer(String name, String position, int number) {
		Team germany=teamRepository.findByPlayers(1l); 
		
		Player player=new Player();
		player.setName(name);
		player.setNum(number); 
		player.setPosition(position);
		player.setTeam(germany);		
		playerRepository.save(player);
		 
	}
	
}
