package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskMapperTest {
    @Test
    void testMapToTask() {
        //Given
        TaskMapper taskMapper = new TaskMapper();
        TaskDto taskDto = new TaskDto(1l, "zadanie", "do zrobienia");
        //When
        Task result = taskMapper.mapToTask(taskDto);
        //Then
        assertEquals(1l, result.getId());
        assertEquals("zadanie", result.getTitle());
        assertEquals("do zrobienia", result.getContent());
    }

    @Test
    void testMapToTaskDto() {
        //Given
        TaskMapper taskMapper = new TaskMapper();
        Task task = new Task(1l, "zadanie", "do zrobienia");
        //When
        TaskDto result = taskMapper.mapToTaskDto(task);
        //Then
        assertEquals(1l, result.getId());
        assertEquals("zadanie", result.getTitle());
        assertEquals("do zrobienia", result.getContent());
    }

    @Test
    void testMapToTaskDtoList() {
        //Given
        TaskMapper taskMapper = new TaskMapper();
        Task task = new Task(1l, "zadanie", "do zrobienia");
        List<Task> tasks = List.of(task);
        //When
        List<TaskDto> result = taskMapper.mapToTaskDtoList(tasks);
        //Then
        assertEquals(1l, result.get(0).getId());
        assertEquals("zadanie", result.get(0).getTitle());
        assertEquals("do zrobienia", result.get(0).getContent());
    }
}