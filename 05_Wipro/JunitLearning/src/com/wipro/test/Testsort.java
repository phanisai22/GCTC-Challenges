package com.wipro.test;

import static org.junit.Assert.*;

import com.wipro.task.DailyTasks;

import org.junit.Test;

public class Testsort {

	@Test
	public void test() {

		int[] output = {-1, 9, 22, 23, 45, 506};
		assertArrayEquals(output, new DailyTasks().sortValues(new int[]{23, 506, -1, 9, 22, 45}));
	}

}
