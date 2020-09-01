package com.wipro.test;

import static org.junit.Assert.*;

import com.wipro.task.DailyTasks;

import org.junit.Test;

public class TestStringConcat {

	@Test
	public void test() {
		DailyTasks dailyTasks = new DailyTasks();
		String output = dailyTasks.doStringConcat("Phani", "Sai");
		assertEquals(output, "Phani Sai");
	}

}
