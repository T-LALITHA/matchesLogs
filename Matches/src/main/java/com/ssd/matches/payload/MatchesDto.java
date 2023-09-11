package com.ssd.matches.payload;

import jakarta.validation.constraints.NotEmpty;

public class MatchesDto {

	private String city;

	private String date;

	private String eliminator;


	private Integer id;

	private String method;

	private Integer neutralVenue;

	@NotEmpty(message = "player of the match shouldn't be empty")
	private String playerOfMatch;

	private String result;

	private Integer resultMargin;

	private String team1;

	private String team2;

	private String tossDecision;

	private String tossWinner;

	private String umpire1;

	private String umpire2;

	private String venue;

	private String winner;

	public MatchesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public MatchesDto(String city, String date, String eliminator, Integer id, String method, Integer neutralVenue,
			String playerOfMatch, String result, Integer resultMargin, String team1, String team2, String tossDecision,
			String tossWinner, String umpire1, String umpire2, String venue, String winner) {
		super();
		this.city = city;
		this.date = date;
		this.eliminator = eliminator;
		this.id = id;
		this.method = method;
		this.neutralVenue = neutralVenue;
		this.playerOfMatch = playerOfMatch;
		this.result = result;
		this.resultMargin = resultMargin;
		this.team1 = team1;
		this.team2 = team2;
		this.tossDecision = tossDecision;
		this.tossWinner = tossWinner;
		this.umpire1 = umpire1;
		this.umpire2 = umpire2;
		this.venue = venue;
		this.winner = winner;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEliminator() {
		return eliminator;
	}

	public void setEliminator(String eliminator) {
		this.eliminator = eliminator;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Integer getNeutralVenue() {
		return neutralVenue;
	}

	public void setNeutralVenue(Integer neutralVenue) {
		this.neutralVenue = neutralVenue;
	}

	public String getPlayerOfMatch() {
		return playerOfMatch;
	}

	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getResultMargin() {
		return resultMargin;
	}

	public void setResultMargin(Integer resultMargin) {
		this.resultMargin = resultMargin;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTossDecision() {
		return tossDecision;
	}

	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}

	public String getTossWinner() {
		return tossWinner;
	}

	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}

	public String getUmpire1() {
		return umpire1;
	}

	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}

	public String getUmpire2() {
		return umpire2;
	}

	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "MatchesDto [city=" + city + ", date=" + date + ", eliminator=" + eliminator + ", id=" + id + ", method="
				+ method + ", neutralVenue=" + neutralVenue + ", playerOfMatch=" + playerOfMatch + ", result=" + result
				+ ", resultMargin=" + resultMargin + ", team1=" + team1 + ", team2=" + team2 + ", tossDecision="
				+ tossDecision + ", tossWinner=" + tossWinner + ", umpire1=" + umpire1 + ", umpire2=" + umpire2
				+ ", venue=" + venue + ", winner=" + winner + "]";
	}
	
	
}
