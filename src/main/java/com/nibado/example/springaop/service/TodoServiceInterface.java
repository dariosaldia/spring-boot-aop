package com.nibado.example.springaop.service;

import java.util.List;
import com.nibado.example.springaop.todo.domain.Todo;

public interface TodoServiceInterface {
  
  List<Todo> allTodosForUser(Long user_id);

}
