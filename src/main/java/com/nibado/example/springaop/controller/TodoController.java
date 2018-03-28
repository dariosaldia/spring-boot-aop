package com.nibado.example.springaop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nibado.example.springaop.annotation.ValidUserType;
import com.nibado.example.springaop.service.TodoServiceInterface;
import com.nibado.example.springaop.todo.domain.Todo;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TodoController {
    
    @Autowired
    private TodoServiceInterface todoServiceInterface;

    @GetMapping(value = "/todos/user")
    @ValidUserType
    public List<Todo> allTodosForUser(@RequestParam Long user_Id) {
        log.info("GET all todo's for user {}", user_Id);
        return todoServiceInterface.allTodosForUser(user_Id);
    }

    /*
    @RequestMapping(value = "/me/{todo}", method = RequestMethod.GET, produces = "application/json")
    public Callable<ResponseEntity<TodoList>> todoList(@RequestHeader("user-id") final UUID userId, @PathVariable("todo") final String todoList) {
        log.info("GET todo {} for user {}", todoList, userId);
        return () -> repository
                .get(userId, todoList)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/me", method = RequestMethod.DELETE)
    public Callable<ResponseEntity<?>> deleteAll(@RequestHeader("user-id") final UUID userId) {
        log.info("DELETE all todo's for user {}", userId);
        return () -> {
            repository.delete(userId);

            return ResponseEntity.accepted().build();
        };
    }

    @RequestMapping(value = "/me/{todo}", method = RequestMethod.DELETE)
    public Callable<ResponseEntity<?>> deleteTodo(@RequestHeader("user-id") final UUID userId, @PathVariable("todo") final String todoList) {
        log.info("DELETE todo {} for user {}", todoList, userId);
        return () -> {
            repository.delete(userId, todoList);

            return ResponseEntity.accepted().build();
        };
    }

    @RequestMapping(value = "/me", method = RequestMethod.POST)
    public Callable<ResponseEntity<Void>> createTodoList(@RequestHeader("user-id") final UUID userId, @RequestBody TodoList todoList) {
        return () -> {
            repository.add(userId, todoList);

            return ResponseEntity.accepted().build();
        };
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    @Restrict
    public Callable<ResponseEntity<?>> deleteAllTodos() {
        log.info("DELETE all todo's");
        return () -> {
            repository.deleteAll();

            return ResponseEntity.accepted().build();
        };
    }
    */
}
