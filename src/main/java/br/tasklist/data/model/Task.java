package br.tasklist.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private boolean done;
	private String content;

	public Task() {
	}

	public Task(long id, boolean done, String content) {
		this(done, content);
		this.id = id;
	}

	public Task(boolean done, String content) {
		this.done = done;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public boolean isDone() {
		return done;
	}

	public String getContent() {
		return content;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
