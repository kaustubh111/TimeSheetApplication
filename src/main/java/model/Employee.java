package main.java.model;


import javax.persistence.*;
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String department;
	
	public Employee()
	{
		
	}
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
	@Override
	 public boolean equals(Object obj) {
	  if (this == obj) {
	   return true;
	  }
	  if (obj == null) {
	   return false;
	  }
	  if (!(obj instanceof Employee)) {
	   return false;
	  }
	  Employee other = (Employee) obj;
	  if (department == null) {
	   if (other.department != null) {
	    return false;
	   }
	  } else if (!department.equals(other.department)) {
	   return false;
	  }
	  if (id == null) {
	   if (other.id != null) {
	    return false;
	   }
	  } else if (!id.equals(other.id)) {
	   return false;
	  }
	  if (name == null) {
	   if (other.name != null) {
	    return false;
	   }
	  } else if (!name.equals(other.name)) {
	   return false;
	  }
	  return true;
	 }
	
	
}
