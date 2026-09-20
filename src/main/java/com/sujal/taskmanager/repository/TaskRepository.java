package com.sujal.taskmanager.repository;
import com.sujal.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task, Long>{

}
