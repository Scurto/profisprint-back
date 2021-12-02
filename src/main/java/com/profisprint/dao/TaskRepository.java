package com.profisprint.dao;

import com.profisprint.model.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

    ArrayList<Task> findByOrderTaskIdOrderByPkTaskIdDesc(String orderTaskId);

    ArrayList<Task> findByCustomerIdOrderByPkTaskIdDesc(String customerId);
}
