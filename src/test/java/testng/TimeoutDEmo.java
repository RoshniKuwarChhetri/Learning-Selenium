package testng;

import org.testng.annotations.Test;

public class TimeoutDEmo {
    @Test(timeOut = 3000)
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test executed");
	}
}
