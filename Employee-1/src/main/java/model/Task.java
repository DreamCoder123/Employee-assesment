package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String description;
	private boolean status;
	private String priority;
	private int assigned_employee_id;
	public Task(int id, String title, String description, boolean status, String priority, int assigned_employee_id) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.priority = priority;
		this.assigned_employee_id = assigned_employee_id;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", priority=" + priority + ", assigned_employee_id=" + assigned_employee_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public int getAssigned_employee_id() {
		return assigned_employee_id;
	}
	public void setAssigned_employee_id(int assigned_employee_id) {
		this.assigned_employee_id = assigned_employee_id;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
