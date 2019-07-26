package com.example.springDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springDemo.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

	
	List<Player> findByTeamId(long teamId);
}
