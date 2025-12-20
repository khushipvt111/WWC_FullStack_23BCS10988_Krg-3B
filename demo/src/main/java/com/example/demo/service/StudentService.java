package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
@Service
public class StudentService {

   private List<Student> students = new ArrayList<>();

   public List<Student> getAllStudents(){
        return students;
   }
   
   public void addstudent(Student student) {
        students.add(student);
    }

}