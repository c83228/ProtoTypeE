import java.awt.image.BufferedImage;
import java.io.IOException;
import SDM.*;
import SCENERE.*;

public class BackGround {

    public static void main(String args[])throws IOException {

        String map1 = "maps/map1.txt";
        SceneDataModule mySceneDataModule = new SceneDataModule();
        mySceneDataModule.loadMap(map1);
        BasicBlock[][] myScene = mySceneDataModule.getScene();
        BufferedImage[] myImgs = mySceneDataModule.getImgs();

        SceneRenderEngine mySceneRenderEngine = new SceneRenderEngine();
        mySceneRenderEngine.renderScene(myImgs,myScene);

    }


}
