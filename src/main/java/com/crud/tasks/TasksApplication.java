package com.crud.tasks;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling       //Moduł 23 4
@OpenAPIDefinition      //Moduł 23 2
@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
//		TaskDto taskDto = new TaskDto(
//				(long)1,
//				"Test title",
//				"I want to be a coder!");
//		Long id = taskDto.getId();
//		String title = taskDto.getTitle();
//		String content = taskDto.getContent();
//		System.out.println(id + " " + title + " " + content);
		SpringApplication.run(TasksApplication.class, args);
	}

}
