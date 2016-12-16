package SDM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

import static org.junit.Assert.*;

public class SceneDataModuleTest {

    SceneDataModule sceneDataModule1 = new SceneDataModule();

    @Before
    public void setUp() throws Exception {
        sceneDataModule1.loadMap("maps/map1.txt");
    }

    @After
    public void tearDown() throws Exception {
        sceneDataModule1 = null;
    }

    @Test(expected = FileNotFoundException.class)
    public void loadMap() throws Exception {

        SceneDataModule sceneDataModule2 = new SceneDataModule();
        sceneDataModule2.loadMap("maps/map2.txt");

        int a = sceneDataModule1.getScene()[0][0].getType();
        assertEquals("test should success",0,a);
    }

    @Test
    public void getScene() throws Exception {

        BasicBlock[][] scene = new BasicBlock[50][20];
        scene[0][0] = new BasicBlock(0);
        assertEquals("test should success",scene[0][0],sceneDataModule1.getScene()[0][0]);


        /*
        BasicBlock[][] myscene = new BasicBlock[50][20];
        myscene[0][0] = new BasicBlock(0);
        int a = myscene[0][0].getType();
        //System.out.println(a);
        int b = sceneDataModule1.getScene()[0][0].getType();
        //System.out.println(b);
        assertEquals("test should success",a,b);
        */
    }

    @Test
    public void getImgs() throws Exception {

        BufferedImage[] myImg = new BufferedImage[4];

        String IMG_0_PATH = "imgs/grass.png";
        String IMG_1_PATH = "imgs/tree.png";
        String IMG_2_PATH = "imgs/water.png";
        String IMG_3_PATH = "imgs/rock.png";

        myImg[0] = ImageIO.read(new File(IMG_0_PATH));
        myImg[1] = ImageIO.read(new File(IMG_1_PATH));
        myImg[2] = ImageIO.read(new File(IMG_2_PATH));
        myImg[3] = ImageIO.read(new File(IMG_3_PATH));

        assertEquals("test should success",myImg[0],sceneDataModule1.getImgs()[0]);


    }

}