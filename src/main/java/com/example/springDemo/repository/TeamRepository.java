package com.example.springDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springDemo.model.Team;


@Repository
public interface TeamRepository  extends CrudRepository<Team, Long>{

	
	Team findByPlayers(long playerId);      
}
