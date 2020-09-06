package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentMain {

    // TestCase 1 (Successfull):
    // static Student data[] = new Student[4];
    // TestCase 2 (Successfull):
    static Student data[] = new Student[10];

    public StudentMain() {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }
        // TestCase 1:
        // data[0] = new Student("Sekar", new int[] { 85, 75, 95 });
        // data[1] = new Student(null, new int[] { 11, 22, 33 });
        // data[2] = null;
        // data[3] = new Student("Manoj", null);

        // TestCase 2:
        data[0] = new Student("A1", new int[]{72, 73, 74});
        data[1] = new Student("B1", new int[]{75, 76, 77});
        data[2] = new Student("C1", new int[]{99, 99, 99});
        data[3] = new Student("C3", new int[]{100, 100, 99});
        data[4] = new Student("B2", new int[]{13, 88, 13});
        data[5] = new Student("C3", new int[]{14, 14, 99});
        data[6] = new Student("A2", new int[]{77, 55, 12});
        data[7] = new Student(null, new int[]{13, 88, 13});
        data[8] = new Student("A2", null);
        data[9] = null;
    }

    public static void main(String[] args) {
        StudentMain initdata = new StudentMain();
        initdata.getClass();
        StudentReport report = new StudentReport();

        for (Student student : data) {
            try {
                if (report.validate(student).equals("VALID")) {
                    System.out.println("Grade for Student " + student.getName() + " is " + report.findGrades(student));
                }
            } catch (NullMarksArrayException | NullNameException | NullStudentObjectException e) {
                e.printStackTrace();
            }
        }

        StudentService service = new StudentService();
        System.out.println("Number of Null Marks :" + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Names :" + service.findNumberOfNullName(data));
        System.out.println("Number of Null Objects :" + service.findNumberOfNullObjects(data));
    }

}
