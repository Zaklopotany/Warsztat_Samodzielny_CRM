package pl.coderslab.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime created = LocalDateTime.now();
	private String header;
	private String description;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Users user;

	@ManyToOne
	@JoinColumn(name = "project_id", nullable =true)
	private Projects projects;
	
	@ManyToOne
	@JoinColumn(name = "task_id", nullable =true)
	private Tasks tasks;

	// get set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tasks getTasks() {
		return tasks;
	}

	public Activity setTasks(Tasks tasks) {
		this.tasks = tasks;
		return this;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getHeader() {
		return header;
	}

	public Activity setHeader(String header) {
		this.header= header;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Activity setDescription(String description) {
		this.description = description;
		return this;
	}

	public Users getUser() {
		return user;
	}

	public Activity setUser(Users user) {
		this.user = user;
		return this;
	}

	public Projects getProjects() {
		return projects;
	}

	public Activity setProjects(Projects projects) {
		this.projects = projects;
		return this;
	}

}
