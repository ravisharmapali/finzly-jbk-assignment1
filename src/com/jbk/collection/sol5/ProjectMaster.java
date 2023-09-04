package com.jbk.collection.sol5;

import java.util.HashMap;
import java.util.Set;

public class ProjectMaster {
	
	private HashMap<Integer, Project> projects = new HashMap<>();
	
	public void addProject(Project project) {
		if (project != null) {
			projects.put(project.getProjectId(), project);
		}
	}

	public void assignTeamMember(int projectId, Set<String> team) {
		
		Project project = projects.get(projectId);
		
		project.setTeam(team);
		System.out.println("Team member " + team + " assigned to project " + project.getProjectName());

	}

	public void viewProjectDetails(Integer projectId) {

		Project project = projects.get(projectId);
		System.out.println("Project Id" + "\t Project Name" + "\t Project Team");
		System.out.println(project.getProjectId() + "\t" + project.getProjectName() + "\t" + project.getTeam());

	}

	public void listAllProjects() {
		System.out.println("---------------------------------");
		System.out.println("Project Id" + "\t Project Name" + "\t Project Team");
        
		for (Project project : projects.values()) {
			System.out.println(project.getProjectId() + "\t" + project.getProjectName() + "\t" + project.getTeam());
			
        }
		
	}

}