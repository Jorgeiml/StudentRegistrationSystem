package com.estudiantes;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    public boolean addStudent(String name, double grade) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return false;
        }
        if (grade < 0 || grade > 100) {
            System.out.println("Error: La calificación debe estar entre 0 y 100.");
            return false;
        }
        studentList.add(new Student(name, grade));
        return true;
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        if(sm.addStudent("John Doe", 85.5)){
            System.out.println("Estudiante agregado.");
        }
        if(!sm.addStudent("", 101)){
            System.out.println("No se pudo agregar estudiante inválido.");
        }
        for(Student s : sm.getAllStudents()){
            System.out.println("Estudiante: " + s.getName() + ", Calificación: " + s.getGrade());
        }
    }
}
