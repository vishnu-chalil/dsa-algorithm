package com.learn.designpatterns.adapter;

import com.learn.designpatterns.adapter.dto.CollegeStudent;
import com.learn.designpatterns.adapter.dto.SchoolStudent;
import com.learn.designpatterns.adapter.dto.SchoolStudentAdapter;
import com.learn.designpatterns.adapter.dto.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("a","b", "c");
        SchoolStudent schoolStudent = new SchoolStudent("X", "Y", "Z");
        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}
