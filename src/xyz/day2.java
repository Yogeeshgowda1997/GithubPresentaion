package xyz;

import org.testng.annotations.Test;

public class day2 {
    @Test
	public void signIn1() {
		System.out.println("signIn1");
	}
    @Test
	public void signIn2() {
		System.out.println("signIn2");
	}
    @Test
	public void signIn3() {
		System.out.println("signIn3");
	}
    @Test(groups= {"smoke"})
	public void signIn4() {
		System.out.println("signIn4");
	}
    @Test
	public void signIn5() {
		System.out.println("signIn5");
	}

}
