package com.example.cricket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class cricket {
	@Id
	private int Sno;
	private String name;
	private int jerseyno;
	private int age;
	private String country;
	private String role;
	private int matches;
	private int runs;
	private int wickets;
	private String teams;
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getTeams() {
		return teams;
	}
	public void setTeams(String teams) {
		this.teams = teams;
	}
	

}
