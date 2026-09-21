package testng;

import org.testng.annotations.Test;

public class DependencyDemo {

    @Test
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void searchTest() {
        System.out.println("Search Test");
    }

    @Test(dependsOnMethods = "searchTest")
    public void logoutTest() {
        System.out.println("Logout Test");
    }
}