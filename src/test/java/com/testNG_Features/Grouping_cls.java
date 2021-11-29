package com.testNG_Features;

import org.testng.annotations.Test;

public class Grouping_cls {
	@Test(groups = "browser")
	private void chrome() {
      System.out.println("chrome");
	}
	@Test(groups = "browser")
	private void firefox() {
      System.out.println("firefox");
	}
	@Test(groups = "songs")
	private void tamil() {
      System.out.println("tamil");
	}
	@Test(groups = "songs")
	private void english() {
      System.out.println("english");
	}
	@Test(groups = "cricket")
	private void dhoni() {
      System.out.println("dhoni");
	}
	@Test(groups = "cricket")
	private void kohli() {
      System.out.println("kohli");
	}
	@Test(groups = "bus")
	private void ac() {
      System.out.println("dhoni");
	}
	@Test(groups = "bus")
	private void non_ac() {
      System.out.println("dhoni");
	}
	
}
