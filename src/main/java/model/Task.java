package main.java.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "task_employee",
	           joinColumns = {@JoinColumn(name = "task_id")},
	           inverseJoinColumns = {@JoinColumn(name = "employee_id")}
	           )
	private List<Employee> assignedEmployees=new ArrayList<Employee>();
	@OneToOne
	@JoinColumn(name = "manager_id")
	private Manager manager;
	private boolean completed;
	private String description;
	
	public Task() 
		{
			
		}
	public Task(List<Employee> assignedEmployees, Manager manager, boolean completed, String description) {
		super();
		this.assignedEmployees = assignedEmployees;
		this.manager = manager;
		this.completed = completed;
		this.description = description;
	}
	
	public Manager getManager() {
	
		  return manager;
	
		 }
		
		 public List<Employee> getAssignedEmployees() {

		  return assignedEmployees;

		 }

		 public void addEmployee(Employee e) {
	
		  assignedEmployees.add(e);
	
		 }
	
		 public void removeEmployee(Employee e) {
		
		  assignedEmployees.remove(e);
		
		 }
		
		 public void completeTask() {
		
		  completed = true;
		
		 }
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Task other = (Task) obj;
			if (assignedEmployees == null) {
				if (other.assignedEmployees != null)
					return false;
			} else if (!assignedEmployees.equals(other.assignedEmployees))
				return false;
			if (completed != other.completed)
				return false;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (manager == null) {
				if (other.manager != null)
					return false;
			} else if (!manager.equals(other.manager))
				return false;
			return true;
		}
		 
		 
}
