package SDM;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SceneDataModule {



     public  void loadMap(String mapfile)throws IOException{

         final String IMG_0_PATH = "imgs/grass.png";
         final String IMG_1_PATH = "imgs/tree.png";
         final String IMG_2_PATH = "imgs/water.png";
         final String IMG_3_PATH = "imgs/rock.png";

         BufferedImage[] imgs = {null, null, null, null};

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
         ArrayList myList = new ArrayList();
         int length=0;
         try {
             while ((tempstring = br.readLine()) != null) {

                 tempArray = tempstring.split(" ");
                 length = tempArray.length;

                 for (int i = 0; i < length; i++) {
                     myList.add(tempArray[i]);
                 }
             }
         }catch(IOException e){
             e.getMessage();
         }
         int collum = myList.size()/length;
         int count=0;

         BasicBlock[][] scene = new BasicBlock[collum][length];
         int[][] trans_array = new int[collum][length];

         for(int x = 0;x < collum;x++) {
             for(int y=0;y<30;y++) {
                 scene[x][y] = new BasicBlock(trans_array[x][y]=Integer.parseInt((String) myList.get(count)));
                 count++;
             }
         }


     }
}