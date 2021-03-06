package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentService {

    public int findNumberOfNullMarksArray(Student s[]) {
        int c = 0;
        StudentReport report = new StudentReport();

        if (s == null)
            throw new NullPointerException("Empty Student List");

        for (Student student : s) {
            try {
                report.validate(student);
            } catch (NullStudentObjectException | NullNameException ea) {
                continue;
            } catch (NullMarksArrayException e) {
                c++;
            }
        }

        return c;
    }

    public int findNumberOfNullName(Student s[]) {
        int c = 0;
        StudentReport report = new StudentReport();

        if (s == null)
            throw new NullPointerException("Empty Student List");

        for (Student student : s) {
            try {
                report.validate(student);
            } catch (NullStudentObjectException | NullMarksArrayException ea) {
                continue;
            } catch (NullNameException e) {
                c++;
            }
        }

        return c;
    }

    public int findNumberOfNullObjects(Student s[]) {
        int c = 0;
        StudentReport report = new StudentReport();

        if (s == null)
            throw new NullPointerException("Empty Student List");

        for (Student student : s) {
            try {
                report.validate(student);
            } catch (NullMarksArrayException | NullNameException ea) {
                continue;
            } catch (NullStudentObjectException e) {
                c++;
            }
        }

        return c;
    
    }
}
