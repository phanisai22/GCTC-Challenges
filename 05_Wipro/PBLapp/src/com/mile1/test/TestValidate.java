package com.mile1.test;

import com.mile1.Exception.NullMarksArrayException;
import com.mile1.Exception.NullNameException;
import com.mile1.Exception.NullStudentObjectException;
import com.mile1.Service.StudentReport;
import com.mile1.bean.Student;

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
