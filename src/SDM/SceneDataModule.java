package SDM;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SceneDataModule {

    private final String IMG_0_PATH = "imgs/grass.png";
    private final String IMG_1_PATH = "imgs/tree.png";
    private final String IMG_2_PATH = "imgs/water.png";
    private final String IMG_3_PATH = "imgs/rock.png";

    private BufferedImage[] imgs = {null, null, null, null};

    private ArrayList myList = new ArrayList();
    //private int length=1;
    //int collum = myList.size()/length;
    private BasicBlock[][] scene = new BasicBlock[50][20];

    public void loadMap(String mapfile)throws IOException{

        try {
            imgs[0] = ImageIO.read(new File(IMG_0_PATH));
            imgs[1] = ImageIO.read(new File(IMG_1_PATH));
            imgs[2] = ImageIO.read(new File(IMG_2_PATH));
            imgs[3] = ImageIO.read(new File(IMG_3_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader map = new FileReader(mapfile);
        BufferedReader br = new BufferedReader(map);
        String tempstring;
        String[] tempArray;
        try {
            while ((tempstring = br.readLine()) != null) {

                 tempArray = tempstring.split(" ");
                 //length = tempArray.length;

                 for (int i = 0; i < 50; i++) {
                     myList.add(tempArray[i]);
                 }
            }
        }catch(IOException e){
            e.getMessage();
        }

        int count=0;
        int[][] trans_array = new int[50][20];

         for(int x = 0;x < 20;x++) {
             for(int y = 0;y < 50;y++) {
                 scene[y][x] = new BasicBlock(trans_array[y][x]=Integer.parseInt((String) myList.get(count)));
                 count++;
             }
         }
    }
    public BasicBlock[][] getScene(){
        return scene;
    }

    public BufferedImage[] getImgs(){
        return imgs;
    }


}