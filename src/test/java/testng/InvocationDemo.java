package testng;

import org.testng.annotations.Test;

public class InvocationDemo {

    @Test(priority = 1, invocationCount = 3)
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(priority = 2)
    public void logoutTest() {
        System.out.println("Logout Test");
    }
}