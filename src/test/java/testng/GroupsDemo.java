package testng;

import org.testng.annotations.Test;

public class GroupsDemo {

    @Test(groups = "smoke")
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(groups = "smoke")
    public void searchTest() {
        System.out.println("Search Test");
    }

    @Test(groups = "regression")
    public void paymentTest() {
        System.out.println("Payment Test");
    }

    @Test(groups = "regression")
    public void logoutTest() {
        System.out.println("Logout Test");
    }
}