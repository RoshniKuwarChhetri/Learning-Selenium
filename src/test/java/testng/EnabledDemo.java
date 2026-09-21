package testng;

import org.testng.annotations.Test;

public class EnabledDemo {

    @Test
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(enabled = false)
    public void paymentTest() {
        System.out.println("Payment Test");
    }

    @Test
    public void logoutTest() {
        System.out.println("Logout Test");
    }
}