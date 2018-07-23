package main.java.model;
import javax.persistence.*;
@Entity
@Table(name="timesheet")
public class TimeSheet {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee emp;
	@OneToMany
	@JoinColumn(name = "task_id")
	private Task task;
	private int hours;
	
	public TimeSheet(Employee emp, Task task, int hours) {
		super();
		this.emp = emp;
		this.task = task;
		this.hours = hours;
	}
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeSheet other = (TimeSheet) obj;
		if (emp == null) {
			if (other.emp != null)
				return false;
		} else if (!emp.equals(other.emp))
			return false;
		if (hours != other.hours)
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TimeSheet [emp=" + emp + ", task=" + task + ", hours=" + hours + "]";
	}

	
	
}
