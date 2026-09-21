package testng;

import org.testng.annotations.Test;

public class DescriptionDemo {

    @Test(description = "Verify login with valid username and password")
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(description = "Verify user can search for a product")
    public void searchTest() {
        System.out.println("Search Test");
    }
}