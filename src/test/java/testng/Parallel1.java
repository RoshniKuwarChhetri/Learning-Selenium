package testng;

import org.testng.annotations.Test;

public class Parallel1 {
	@Test
public void a() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("parallel 1");
}
}
