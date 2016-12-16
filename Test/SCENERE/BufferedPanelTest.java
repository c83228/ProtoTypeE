package SCENERE;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import SDM.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

public class BufferedPanelTest {

    private BufferedPanel panel;

    @Before
    public void setUp() throws Exception {
        BufferedImage[] imgs =  {null, null, null, null};
        BasicBlock[][] scene = new BasicBlock[50][20];
        panel = new BufferedPanel(imgs, scene);
    }

    @After
    public void tearDown() throws Exception {
        panel = null;
    }

    @Test
    public void updatePosition() throws Exception {
        panel.updatePosition(2400,1000);
        assertEquals("test should success", 2400, panel.x);
        assertEquals("test should success", 1000, panel.y);

    }

    @Test
    public void paintComponent() throws Exception {

    }

    @Test
    public void keyTyped() throws Exception {

    }

    @Test
    public void keyPressed() throws Exception {

       /* panel.addKeyListener(panel);
        KeyEvent e = new KeyEvent();

        int keyCode =  e.getKeyCode();

        if (keyCode == KeyEvent.VK_LEFT)
            assertEquals("test should success", 475, panel.x);
        else if (keyCode == KeyEvent.VK_RIGHT)
            assertEquals("test should success", 525, panel.x);
        else if (keyCode == KeyEvent.VK_UP)
            assertEquals("test should success", 375, panel.y);
        else if (keyCode == KeyEvent.VK_DOWN)
            assertEquals("test should success", 425, panel.y);
        */
    }

    @Test
    public void keyReleased() throws Exception {

    }

}