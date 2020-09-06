package com.mile1.test;

import static org.junit.Assert.*;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

import org.junit.Test;

public class TestFindGrades {

	@Test
	public void testGradeA() {
		assertEquals("Function returned incorrect Grade", "A",
				new StudentReport().findGrades(new Student(null, new int[] { 72, 73, 74 })));
	}

	@Test
	public void testGradeD() {
		assertEquals("There is No D grading", "D",
				new StudentReport().findGrades(new Student(null, new int[] { 40, 40, 40 })));
	}

	@Test
	public void testGradeF() {
		assertEquals("Function returned incorrect Grade", "F",
				new StudentReport().findGrades(new Student(null, new int[] { 35, 90, 12 })));
	}

}
