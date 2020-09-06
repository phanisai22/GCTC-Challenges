package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String findGrades(Student studentObject) {
        String grade;
        double sum = 0;
        for (int mark : studentObject.getMarks()) {
            if (mark < 35) {
                grade = "F";
                return grade;
            }
            sum += mark;
        }

        if (sum < 150)
            grade = "C";
        else if (sum < 200)
            grade = "B";
        else if (sum < 250)
            grade = "A";
        else
            grade = "A+";

        return grade;
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        
        if (s == null)
            throw new NullStudentObjectException();

        else if (s.getName() == null)
            throw new NullNameException();

        else if (s.getMarks() == null)
            throw new NullMarksArrayException();
        
        return "VALID";
    }
}
