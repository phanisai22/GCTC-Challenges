package com.mile1.test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

import org.junit.Test;

public class TestValidate {

	@Test(expected = NullNameException.class)
	public void testNullName() throws NullMarksArrayException, NullStudentObjectException, NullNameException {
		new StudentReport().validate(new Student(null, new int[] { 100, 100, 100 }));
	}

	@Test(expected = NullMarksArrayException.class)
	public void testNullMarks() throws NullMarksArrayException, NullStudentObjectException, NullNameException {
		new StudentReport().validate(new Student("Student Dummy", null));
	}

	@Test(expected = NullStudentObjectException.class)
	public void testNullStudentObject() throws NullMarksArrayException, NullStudentObjectException, NullNameException {
		new StudentReport().validate(null);
	}

}
