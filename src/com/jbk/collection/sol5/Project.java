package com.jbk.collection.sol5;

import java.util.Set;

public class Project {

	private int projectId;
	private String projectName;
	private Set<String> team;

	public Project() {
		
	}

	public Project(int projectId, String projectName, Set<String> team) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.team = team;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Set<String> getTeam() {
		return team;
	}

	public void setTeam(Set<String> team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", team=" + team + "]";
	}

}
