package com.estudiantes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    public void testAddValidStudent() {
        StudentManager manager = new StudentManager();
        assertTrue(manager.addStudent("Juan Pérez", 90));
        assertEquals(1, manager.getAllStudents().size());
    }

    @Test
    public void testAddStudentWithInvalidName() {
        StudentManager manager = new StudentManager();
        assertFalse(manager.addStudent("", 90));
    }

    @Test
    public void testAddStudentWithInvalidGrade() {
        StudentManager manager = new StudentManager();
        assertFalse(manager.addStudent("Ana", 120));
    }
}
