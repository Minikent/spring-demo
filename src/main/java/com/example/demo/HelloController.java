package com.example.demo;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/api") // This means URL's start with /demo (after Application path)
public class HelloController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/todos")
    public @ResponseBody Iterable<ToDo> getAllTodos() {
        return toDoRepository.findAll();
    }
}