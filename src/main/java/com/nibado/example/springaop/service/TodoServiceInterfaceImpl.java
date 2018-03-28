package com.nibado.example.springaop.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nibado.example.springaop.todo.domain.Todo;
import com.nibado.example.springaop.todo.repository.TodoRepository;

@Service
public class TodoServiceInterfaceImpl implements TodoServiceInterface{

  @Autowired
  private TodoRepository repository;
  
  @Override
  public List<Todo> allTodosForUser(Long user_id) {
    List<Todo> todos = new ArrayList<>();
    return todos;
  }

}
