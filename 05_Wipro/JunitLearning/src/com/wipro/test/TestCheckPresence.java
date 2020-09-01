package com.wipro.test;

import static org.junit.Assert.*;

import com.wipro.task.DailyTasks;

import org.junit.Test;

public class TestCheckPresence {

	@Test
	public void CheckTrue() {
		assertTrue("Cannot find the presence", new DailyTasks().checkPresence("phani sai", "ani"));
	}
	
	@Test
	public void CheckFalse() {
		assertFalse("Found the presence", new DailyTasks().checkPresence("phani sai", "test"));	
	}

}
