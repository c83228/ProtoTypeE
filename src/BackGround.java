import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import SDM.*;
import SCENERE.*;



public class BackGround {

    public static void main(String args[])throws IOException {

        String map1 = "maps/map1.txt";
        SceneDataModule mySceneDataModule = new SceneDataModule();
        mySceneDataModule.loadMap(map1);

        SceneRenderEngine mySceneRenderEngine = new SceneRenderEngine();
        mySceneRenderEngine.renderScene();


    }


}
