package com.mile1.Service;

import com.mile1.Exception.NullMarksArrayException;
import com.mile1.Exception.NullNameException;
import com.mile1.Exception.NullStudentObjectException;
import com.mile1.bean.Student;

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
