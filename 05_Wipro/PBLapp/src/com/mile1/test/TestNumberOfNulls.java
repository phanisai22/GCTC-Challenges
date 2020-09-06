package com.mile1.test;

import static org.junit.Assert.*;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

import org.junit.Before;
import org.junit.Test;

public class TestNumberOfNulls {

	Student[] students;

	@Before
	public void data() {
		students = new Student[] { new Student("A1", new int[] { 72, 73, 74 }),
				new Student("B1", new int[] { 75, 76, 77 }), new Student("C1", new int[] { 99, 99, 99 }),
				new Student(null, new int[] { 100, 100, 99 }), new Student("B2", new int[] { 13, 88, 13 }),
				new Student("null", new int[] { 14, 14, 99 }), new Student("A2", new int[] { 77, 55, 12 }),
				new Student(null, new int[] { 13, 88, 13 }), new Student("A2", null), null };
	}

	@Test
	public void testNumberOfNullNames() {
		assertEquals(2, new StudentService().findNumberOfNullName(students));
	}

	@Test
	public void testNumberOfNullMarks() {
		assertEquals(1, new StudentService().findNumberOfNullMarksArray(students));
	}

	@Test
	public void testNumberOfNullObjects() {
		assertEquals(1, new StudentService().findNumberOfNullObjects(students));
	}

}
