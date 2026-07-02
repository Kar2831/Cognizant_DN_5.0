package org.karthikeyan.methods;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskRepositoryTest {
    TaskRepository repository;

    @BeforeEach
    public void intialize(){
        repository = new TaskRepository();
    }

    @Test
    public void addValidTask(){
        repository.addTask("Wake Up early in the morning");
        assertEquals(1, repository.getTaskCount());
    }

    @Test
    public void addDuplicateTask(){
        repository.addTask("Study");
        int taskCount = repository.tasks.size();
        boolean result = repository.addTask("Study");
        assertFalse(result, "Adding a duplicate task should return false");
        assertEquals(taskCount, repository.tasks.size());
    }

    @Test
    public void removeTask(){
        repository.addTask("Study");
        int taskCount = repository.tasks.size();
        boolean result = repository.removeTask("Study");
        assertTrue(result, "Task removed Successfully");
        assertEquals(taskCount - 1, repository.tasks.size());
    }

    @Test
    public void invalidTask(){
        String input = " ";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->repository.addTask(input));
        assertEquals("String should not be empty", exception.getMessage());
    }

    @AfterEach
    public void clear(){
        System.out.println("Test is Finished");
        repository = null;
    }
}
