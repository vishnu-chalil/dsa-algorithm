package com.learn.designpatterns.adapter;

import com.learn.designpatterns.adapter.dto.Student;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();
        List<Student> studentList = studentClient.getStudentList();
        System.out.println(studentClient.toString() );
    }
}

