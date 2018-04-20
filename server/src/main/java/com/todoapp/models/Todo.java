package com.todoapp.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.Id;

@XmlRootElement
@Entity
public class Todo {
	
		@Id @GeneratedValue
		private Long todoId;

	    private String title;

	    private Boolean completed = false;

	    private Date createdAt = new Date();

	
	public Todo() {
		super();
	}

	/**
	 * @param title
	 * @param completed
	 * @param createdAt
	 */
	public Todo(String title, Boolean completed, Date createdAt) {
		super();
		this.title = title;
		this.completed = completed;
		this.createdAt = createdAt;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the completed
	 */
	public Boolean getCompleted() {
		return completed;
	}


	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}


	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}


	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the todoId
	 */
	public Long getTodoId() {
		return todoId;
	}

	/**
	 * @param todoId the todoId to set
	 */
	public void setTodoId(Long todoId) {
		this.todoId = todoId;
	}
	
	
}
