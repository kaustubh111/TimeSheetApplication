package main.java.service;
import main.java.model.*;
import java.util.List;



public interface Timesheetservice {

	
	Task busiestTask();
	
	List<Task> listTask(Employee e);
	
	List<Task> listManTask(Manager m);
}
