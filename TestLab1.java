package com.bwj.example;

import static org.junit.Assert.*;

import org.junit.*;

import junit.extensions.ActiveTestSuite;

public class TestLab1 {
	public CanTakeOut lab1;
	public static int i = 0;
	
	@BeforeClass
	public static void beforeClass() {
		i ++;
		System.out.println("BeforeClass执行第" + i + "次");
	}
	
	@Before
	public void init() {
		lab1 = new CanTakeOut();
		i ++;
		System.out.println("Before执行第" + i + "次");
	}
	
	@Test
	public void testLab1_1() {
		assertTrue(lab1.getResult(13));
		i ++;
		System.out.println("Test_1执行第" + i + "次");
		
	}
	
	@Test
	public void testLab1_2() {
		assertTrue(lab1.getResult(23));
		i ++;
		System.out.println("Test_2执行第" + i + "次");
		
	}
	
	@Test
	public void testLab1_3() {
		assertFalse(lab1.getResult(39));
		i ++;
		System.out.println("Test_3执行第" + i + "次");
		
	}
	
	@Test
	public void testLab1_4() {
		assertFalse(lab1.getResult(200));
		i ++;
		System.out.println("Test_4执行第" + i + "次");
	}
	
	@After
	public void release() {
		i ++;
		System.out.println("After执行第" + i + "次");
	}
	
	@AfterClass
	public static void afterClass() {
		i ++;
		System.out.println("AfterClass执行第" + i + "次");
	}
}
