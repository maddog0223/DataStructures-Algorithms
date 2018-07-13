package Data_Structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList<Number> llt = new LinkedList();

    @Before
    public void setUp() throws Exception {

        llt.append(3);
    }

    @Test
    public void append() {

        llt.append(4);

    }

    @Test
    public void prepend() {

        llt.prepend(2);
        assertNotNull(llt.find(2));
    }

    @Test
    public void find() {
    }

    @Test
    public void delete() {
    }
}