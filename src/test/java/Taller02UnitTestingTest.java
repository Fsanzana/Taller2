import junit.framework.TestCase;

public class Taller02UnitTestingTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    private Taller02UnitTesting sismo;

    public void testLlenarDatos() {
        sismo = new Taller02UnitTesting();
        sismo.Taller02UnitTesting(7);
        assertEquals(7,sismo.getDias());
        assertFalse(sismo.exceeds);

    }
}