import javax.swing.*;
import java.awt.*;
class BasicBlock {
    private int type;
    public BasicBlock(int type) {
        this.type = type;
    }
    public int getType() {
        return this.type;
    }

}



class BackGround extends JFrame {

    public BackGround() {
        ImageIcon images[] = new ImageIcon[4];
        images[0] = new ImageIcon("C:\\Users\\hsu\\Desktop\\ice.png");
        images[1] = new ImageIcon("C:\\Users\\hsu\\Desktop\\rock.png");
        images[2] = new ImageIcon("C:\\Users\\hsu\\Desktop\\ice_corner.png");
        images[3] = new ImageIcon("C:\\Users\\hsu\\Desktop\\ice_wall.png");

        BasicBlock[][] scene = new BasicBlock[20][50];
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 50; x++) {
                scene[y][x] = new BasicBlock((int) (Math.random() * 10 % 4));
                setLayout(new GridLayout(20, 50));
                add(new JLabel(images[scene[y][x].getType()]));
            }
        }



    }

    public static void main(String args[]) {

        JFrame background = new BackGround();
        background.setSize(5000 , 2000);
        background.setResizable(false);
        background.setVisible(true);
        background.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        background.setLocationRelativeTo(null);
        background.add(new Game());


    }


}
