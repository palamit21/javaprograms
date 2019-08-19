package com.java.test;

public class Project {
	public Project(String pname, String teamLead) {
		super();
		this.setPname(pname);
		this.setTeamLead(teamLead);
		this.setLocation(location);
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTeamLead() {
		return teamLead;
	}
	public void setTeamLead(String teamLead) {
		this.teamLead = teamLead;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String pname;
    private String teamLead;
    private String location;

}
