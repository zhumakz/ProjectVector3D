package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class Vector2DTest {
    
    public Vector2DTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of length method, of class Vector2D.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector2D instance = new Vector2D(1200,7);
        double expResult = Math.sqrt(1200*1200 +7*7);
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class Vector2D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D anotherVector = new Vector2D(2,3);
        Vector2D instance = new Vector2D(2,3);
        Vector2D expResult = new Vector2D(2+2,3+3);
        Vector2D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplyByScalar method, of class Vector2D.
     */
    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 1.0;
        Vector2D instance = new Vector2D(2,3);
        Vector2D expResult = new Vector2D(2*1.0, 3*1.0);
        Vector2D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of dotProduct method, of class Vector2D.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector2D anotherVector = new Vector2D(2,3);
        Vector2D instance = new Vector2D(2,3);
        double expResult = (13);
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Vector2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(2,3);
        String expResult = "[2.0, 3.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of equals method, of class Vector2D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = null;
        Vector2D instance = new Vector2D();
        boolean expResult = false;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
