package com.task.task.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.task.dao.TaskDao;
import com.task.task.entities.Task;

@Service
public class TaskServiceImpl implements TaskService {
	List<Task> list;
	
	@Autowired
	private TaskDao taskDao;
	public TaskServiceImpl() {
		
//		list = new ArrayList<Task>();
//		list.add(new Task(1,"Do this","here","23/2/2","do that"));
//		list.add(new Task(2,"akak","hshsh","22/2/3","swsw"));
		
	}

	@Override
	public List<Task> alltask() {
		return taskDao.findAll();
		
		//return list;
	}
	
	@Override
	public Task getTask(long id){	
    return taskDao.findById(id).get();
		
		
	}
	
	@Override
	public Task addTask(Task task){
		return taskDao.save(task);
		//return list;
		
	}

	@Override
	public Task updateTask(Task task){
		return taskDao.save(task);
		//return list;
		
	}
	
	@Override
	public void deleteTask(long id){
		
		Task entity = taskDao.findById(id).get(); 
		taskDao.delete(entity);
		//return list;
		
	}


}
