package Toutorial;

import org.testng.annotations.Test;

public class Demo1 {
	@Test(priority=2)
	public void abc() {
		System.out.println("abc  method");
	}
	@Test(priority=3)
	public void pqr() {
		System.out.println("pqr  method");
	}
	@Test
	public void xyz() {
		System.out.println("xyz  method");
	}

}
