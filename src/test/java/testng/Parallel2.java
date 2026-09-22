package testng;

import org.testng.annotations.Test;

public class Parallel2 {
    @Test
	public void b() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Parallel 2");
	}
}
