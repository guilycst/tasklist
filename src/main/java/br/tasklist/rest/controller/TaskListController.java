package br.tasklist.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.tasklist.data.model.Task;
import br.tasklist.data.repository.TaskRepository;

@RestController
public class TaskListController {

	@Autowired
	private TaskRepository taskRepository;

	@RequestMapping(path = "/task", method = RequestMethod.GET)
	public Iterable<Task> all() {
		return taskRepository.findAll();
	}

	@RequestMapping(path = "/task/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Task> delete(@PathVariable long id) {
		Optional<Task> findById = taskRepository.findById(id);
		if (findById.isPresent())
			taskRepository.deleteById(id);
		else
			return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Task>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(path = "/task", method = RequestMethod.PATCH)
	public ResponseEntity<Task> update(@RequestBody Task task) {
		if (taskRepository.findById(task.getId()).isPresent())
			taskRepository.save(task);
		else
			return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Task>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(path = "/task", method = RequestMethod.POST)
	public Task create(@RequestBody Task task) {
		task.setId(0);
		return taskRepository.save(task);
	}

}
