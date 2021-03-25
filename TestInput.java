package com.bwj.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestInput {
	public int input;
	public int expected;
	
	public TestInput(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}
	
//	@Parameters(name = "{index}: maxMutli({0})={1}")
//	public static List<Integer[]> parameterss(){
//		return Arrays.asList(new Integer[][] 
//				{{1, 2}, {2, 1}, {10, 36}, {11, 54}}
//		);
//	}
//	
	
	@Parameters(name = "{index}: maxMutli({0})={1}")
	public static List<Integer[]> parameters(){
		List<Integer[]> list = new ArrayList<>();
		File inputFile = new File("testinput.txt");
		if (!inputFile.exists()) {
			System.out.println("未找到文件");
			System.exit(-1);
		}
		Reader fis;
		try {
			fis = new FileReader(inputFile);
			BufferedReader br= new BufferedReader(fis);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] inputs = line.split(",");
				if (inputs.length != 2) {
					break;
				}
				Integer[] tmp = {Integer.valueOf(inputs[0]), Integer.valueOf(inputs[1])};
				list.add(tmp);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int maxMutli() {
		int maxMulti = 0;
		if (input == 1) {
			maxMulti = 1;
		}else if (input > 4) {
			int extra = this.input % 3;
			// m表示幂次
			int m = this.input / 3;
			if (extra == 1) {
				m -= 1;
				maxMulti = (int) Math.pow(3, m);
				maxMulti *= 4;
			} else {
				if (extra == 0) {
					maxMulti = (int) Math.pow(3, m);
				}else {
					maxMulti = (int) Math.pow(3, m) * extra;
				}
			}
		}else {
			int a = input / 2;
			maxMulti = a * (input -a);
		}
		return maxMulti;
	}
	
	@Test
	public void testInput() {
		System.out.println(maxMutli() + " " + expected);
		assertEquals(maxMutli(), expected);
	}
	
}
