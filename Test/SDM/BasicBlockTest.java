package SDM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicBlockTest {
    private BasicBlock basicBlock;

    @Before
    public void setUp() throws Exception {
        basicBlock = new BasicBlock(3);
    }

    @After
    public void tearDown() throws Exception {
        basicBlock = null ;
    }

    @Test
    public void getType() throws Exception {
        assertEquals("test should success",3,basicBlock.getType());
    }

}