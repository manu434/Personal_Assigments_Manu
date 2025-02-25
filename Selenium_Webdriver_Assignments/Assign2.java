package testNg_assignment;

import org.testng.annotations.Test;

public class Assign2 {
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("main-1");
	}

	@Test(groups = { "sanity", "regression" })
	public void test2() {
		System.out.println("main-2");
	}

	@Test(groups = "functional")
	public void test3() {
		System.out.println("main-3");
	}

	@Test(groups = { "functional", "sanity" })
	public void test4() {
		System.out.println("main-4");
	}

	@Test(groups = "sanity")
	public void test5() {
		System.out.println("main-5");
	}
}
