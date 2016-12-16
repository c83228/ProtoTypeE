package SCENERE;

import java.awt.*;
import java.awt.image.BufferedImage;
import SDM.*;
import javax.swing.*;

public class SceneRenderEngine {


    private static final int SCREEN_HEIGHT = 300;
    private static final int SCREEN_WIDTH = 500;



    public void renderScene(BufferedImage[] imgs,BasicBlock[][] scene){

        BufferedPanel panel = new BufferedPanel(imgs, scene);
        panel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        panel.setLayout(null);

        JFrame frame = new JFrame("Map");
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}
