package com.task.task.services;
import java.util.List;
import com.task.task.entities.Task;
public interface TaskService 
{
public List<Task> alltask();

public Task getTask(long id);

public Task addTask(Task task);

public Task updateTask(Task task);

public void deleteTask(long id);


}
