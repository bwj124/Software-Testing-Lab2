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
		System.out.println("BeforeClassִ�е�" + i + "��");
	}
	
	@Before
	public void init() {
		lab1 = new CanTakeOut();
		i ++;
		System.out.println("Beforeִ�е�" + i + "��");
	}
	
	@Test
	public void testLab1_1() {
		assertTrue(lab1.getResult(13));
		i ++;
		System.out.println("Test_1ִ�е�" + i + "��");
		
	}
	
	@Test
	public void testLab1_2() {
		assertTrue(lab1.getResult(23));
		i ++;
		System.out.println("Test_2ִ�е�" + i + "��");
		
	}
	
	@Test
	public void testLab1_3() {
		assertFalse(lab1.getResult(39));
		i ++;
		System.out.println("Test_3ִ�е�" + i + "��");
		
	}
	
	@Test
	public void testLab1_4() {
		assertFalse(lab1.getResult(200));
		i ++;
		System.out.println("Test_4ִ�е�" + i + "��");
	}
	
	@After
	public void release() {
		i ++;
		System.out.println("Afterִ�е�" + i + "��");
	}
	
	@AfterClass
	public static void afterClass() {
		i ++;
		System.out.println("AfterClassִ�е�" + i + "��");
	}
}
