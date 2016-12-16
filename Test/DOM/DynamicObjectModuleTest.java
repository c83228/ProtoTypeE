package DOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class DynamicObjectModuleTest {

    DynamicObjectModule DynamicObjectModule = new DynamicObjectModule();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        DynamicObjectModule = null ;
    }

    @Test
    public void testGetVirtualCharacterXY() throws Exception {

        assertEquals("test should success", new Point(1400, 800), DynamicObjectModule.getVirtualCharacterXY());

    }

}