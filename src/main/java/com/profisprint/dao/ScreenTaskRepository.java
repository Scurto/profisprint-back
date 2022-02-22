package com.profisprint.dao;

import com.profisprint.model.domain.ScreenTask;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ScreenTaskRepository extends CrudRepository<ScreenTask, Long> {

    ArrayList<ScreenTask> findByOrderTaskIdOrderByPkTaskIdDesc(String orderTaskId);

    ArrayList<ScreenTask> findByCustomerIdOrderByPkTaskIdDesc(String customerId);
}
