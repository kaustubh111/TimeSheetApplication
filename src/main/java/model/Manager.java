package main.java.model;
import javax.persistence.*;
@Entity
@Table(name="manager")
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;

	public Manager() {
		
	}
	public Manager(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	 public boolean equals(Object obj) {
	  if (this == obj) {
	   return true;
	  }
	  if (obj == null) {
	   return false;
	  }
	  if (!(obj instanceof Manager)) {
	   return false;
	  }
	  Manager other = (Manager) obj;
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
