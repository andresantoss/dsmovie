package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

	private Long MovieID;
	private String email;
	private Double score;
	
	public ScoreDTO() {
	}

	public Long getMovieID() {
		return MovieID;
	}

	public void setMovieID(Long movieID) {
		MovieID = movieID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
