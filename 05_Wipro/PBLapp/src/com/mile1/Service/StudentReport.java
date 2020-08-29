package com.mile1.Service;

import com.mile1.Exception.NullMarksArrayException;
import com.mile1.Exception.NullNameException;
import com.mile1.Exception.NullStudentObjectException;
import com.mile1.bean.Student;

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
