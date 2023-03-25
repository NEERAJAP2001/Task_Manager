package com.task.task.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  com.task.task.entities.Task;

import com.task.task.services.TaskService;
import java.util.List;
@RestController
@CrossOrigin
public class MyController {
	@Autowired
	private TaskService taskservice;

	@GetMapping("/alltask")
	public List<Task> alltask() {
		return this.taskservice.alltask();
	}
	
	@PostMapping("/saveTask")
	public Task savetask(@RequestBody Task task ) {
		
		return this.taskservice.addTask(task);
		//return "Save Here";
	}
	
	@PostMapping("/changeStatus")
	public Task changestatus(@RequestParam(value="id") Task task) {
		return this.taskservice.updateTask(task);
	}
	
	@GetMapping("/getTask")
	public Task getTask(@RequestParam(value="id") long id) {
		return this.taskservice.getTask(id);
	}
	
	
	@DeleteMapping("/deleteTask")
	public void delete(@RequestParam(value="id") long id) {
		this.taskservice.deleteTask(id);
	}
	
}
