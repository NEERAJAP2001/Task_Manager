package com.task.task.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
	private String taskHolderName;
	private String taskDate;
	private String taskName;
	private String taskStatus;
	@Id
	private long taskId;
	public long getTaskId() {
		return taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	public String getTaskHolderName() {
		return taskHolderName;
	}
	public void setTaskHolderName(String taskHolderName) {
		this.taskHolderName = taskHolderName;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
}

	
//	public Task() {
//		super();
//	}
//
//	public Task(long id, String name, String date, String tname, String tstatus) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.date = date;
//		this.tname = tname;
//		this.tstatus = tstatus;
//	}
//	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDate() {
//		return date;
//	}
//
//	public void setDate(String date) {
//		this.date = date;
//	}
//
//	public String getTname() {
//		return tname;
//	}
//
//	public void setTname(String tname) {
//		this.tname = tname;
//	}
//
//	public String getTstatus() {
//		return tstatus;
//	}
//
//	public void setTstatus(String tstatus) {
//		this.tstatus = tstatus;
//	}
//
//
//	
//	
//
//}
