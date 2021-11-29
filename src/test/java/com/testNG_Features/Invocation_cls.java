package com.testNG_Features;

import org.testng.annotations.Test;

public class Invocation_cls {
	@Test
	private void browser() {
		System.out.println("browser");
	}
	@Test(priority = 1,invocationCount = 3)
	private void referesh() {
		System.out.println("referesh");
	}
	@Test(priority = 2)
	private void click() {
    System.out.println("click");
	}

}
