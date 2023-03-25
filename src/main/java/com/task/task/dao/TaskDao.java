package com.task.task.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.task.task.entities.Task;

public interface TaskDao extends JpaRepository<Task,Long>{

	
	
	
}
