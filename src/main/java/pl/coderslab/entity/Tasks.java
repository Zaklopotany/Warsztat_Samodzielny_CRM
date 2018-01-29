package pl.coderslab.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subject;
	private String description;
	@ManyToOne(fetch = FetchType.EAGER)
	private Projects projects;
	@OneToOne
	private TaskStatus taskStatus;
	@OneToOne
	private TaskPriority taskPriority;
	@OneToOne
	@JoinColumn(name = "user_id")
	private Users users; // user assigned to task 
	private LocalDateTime created = LocalDateTime.now();

	// get set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Projects getProjects() {
		return projects;
	}

	public Tasks setProjects(Projects projects) {
		this.projects = projects;
		return this;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public Tasks setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
		return this;
	}

	public TaskPriority getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(TaskPriority taskPriority) {
		this.taskPriority = taskPriority;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
