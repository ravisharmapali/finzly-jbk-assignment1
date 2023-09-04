package com.jbk.collection.sol5;

import java.util.HashSet;
import java.util.Set;

public class ProjectManagementSystem {
	public static void main(String[] args) {

		ProjectMaster projectMaster = new ProjectMaster();

		//adding projects
		Project project = new Project();
		project.setProjectId(121);
		project.setProjectName("Student Management");

		Set<String> team = new HashSet<>();
		team.add("Ravi");
		team.add("Ram");
		team.add("Krishna");
		team.add("Radha");
		projectMaster.addProject(project);
		
		projectMaster.assignTeamMember(121, team);
//		projectMaster.addProject(project);

		
		Project project2 = new Project();
		project2.setProjectId(122);
		project2.setProjectName("CRM System");

		Set<String> team2 = new HashSet<>();
		team2.add("Uddhav");
		team2.add("Gopal");
		team2.add("Hari");
		projectMaster.addProject(project2);
		projectMaster.assignTeamMember(122, team2);
		
		
		// view project details:
		projectMaster.viewProjectDetails(122);
		
		//view all projects
		projectMaster.listAllProjects();
		
		
	}
}
