import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/10/17.
 */
public class CubeTest {

    @Test
    public void newCube_instantiatesCorrectly() throws Exception {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(true, testCube instanceof Cube);
    }


}