package Data_Structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PracticeHashMapTest {

    PracticeHashMap<String, Number> testmap = new PracticeHashMap();


    @Before
    public void setUp() throws Exception {

        testmap.add("Ryan", 36);
        testmap.add("Saulo",30);
        testmap.add("Ashley",30);
    }

    @Test
    public void add() throws Exception {

        testmap.add("Madoka",21);
        assertNotNull(testmap.find("Madoka"));

    }

    @Test
    public void remove() throws Exception{
        testmap.remove("Ryan");
        assertNull(testmap.find("Ryan"));

    }

    @Test
    public void find() throws Exception {

        assertEquals(36,testmap.find("Ryan"));
    }
}