package junit_5;


import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class JunitBeforeAllTest {

    private JunitBeforeAll junitBeforeAll;

    @BeforeAll
    public static void beforeClassFunction(){
        System.out.println("Before Class");
    }

    @BeforeEach
    public void beforeFunction(){
        junitBeforeAll=new JunitBeforeAll();
        System.out.println("Before Function");
    }

    @AfterEach
    public void afterFunction(){
        System.out.println("After Function");
    }

    @AfterAll
    public static void afterClassFunction(){
        System.out.println("After Class");
    }

    @Test
    public void initializeTest(){
        Assert.assertEquals("Initailization check", "Initialize", junitBeforeAll.initializeData() );
    }

    @Test
    public void processTest(){
        Assert.assertEquals("Process check", "Process", junitBeforeAll.processDate() );
    }

}