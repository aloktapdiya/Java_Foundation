package junit_5;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DuplicateKeyTest {

    private HashMap map;
    // Set up an empty map before each test
    @Before
    public void setUp() {
        this.map = new HashMap();
    }

    @Test
    public void testEmailIdWithDuplicateKey() throws Exception {
        /*Arrange*/
        HashMap hm1 = new HashMap();
        hm1.put("Emp01", "test1@testdomain.com");
        hm1.put("Emp02", "test2@testdomain.com");
        hm1.put("Emp02", "test3@testdomain.com");
        /*Act*/
        int size = hm1.size();
        /*Assert*/
        assertNotEquals("Duplicate key in collection ", 3, size);
    }
    @Test
    public void testGetReturnsCorrectValue() {
        HashMap hm1 = new HashMap();

        hm1.put("Hello", 5);
        hm1.put("Goodbye", 6);
        assertEquals(5, hm1.get("Hello"));
        assertEquals(6, hm1.get("Goodbye"));
    }

}