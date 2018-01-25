package pl.coderslab.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	// walidacja
	private String site;
	private LocalDateTime created = LocalDateTime.now();
	private String identifier;
	@ManyToMany(mappedBy = "projects")
	Set<Users> users = new HashSet<>();
	private boolean activity;
	@Transient
	private int tasksNumber;
	@Transient
	private int usersNumber;

	// get set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTasksNumber() {
		return tasksNumber;
	}

	public Projects setTasksNumber(int tasksNumber) {
		this.tasksNumber = tasksNumber;
		return this;
	}

	public int getUsersNumber() {
		return usersNumber;
	}

	public Projects setUsersNumber(int usersNumber) {
		this.usersNumber = usersNumber;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		// indentifier setter
		String regex = "[ąśćżłóęńź\\s]";
		this.identifier = name.replaceAll(regex, "-");
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}

	public boolean isActivity() {
		return activity;
	}

	public void setActivity(boolean activity) {
		this.activity = activity;
	}

	public String getDescription() {
		return description;
	}

	public String getIdentifier() {
		return identifier;
	}

	public Projects setDescription(String description) {
		this.description = description;
		return this;
	}

}
