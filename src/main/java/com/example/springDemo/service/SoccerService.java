package com.example.springDemo.service;

import java.util.List;

public interface SoccerService {
	
	
    public List<String> getAllTeamPlayers(long teamId);
	
	public void addGermanyTeamPLayer(String name,String position,int number);

}
