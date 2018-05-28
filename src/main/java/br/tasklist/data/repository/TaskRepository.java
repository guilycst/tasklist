package br.tasklist.data.repository;

import org.springframework.data.repository.CrudRepository;

import br.tasklist.data.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}