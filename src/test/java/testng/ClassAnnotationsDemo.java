package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationsDemo {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @Test
    public void testLogin() {
        System.out.println("Login Test");
    }

    @Test
    public void testLogout() {
        System.out.println("Logout Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
}