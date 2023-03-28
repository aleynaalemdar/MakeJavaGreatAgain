package oyun1_kus;
//baska package daki koda ulasabiiliyo muyum raht√ßa

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BottomPipe {
    //global variables
    private Image bottomPipe;
    private int xLoc = 0, yLoc = 0;


    public BottomPipe(int initialWidth, int initialHeight) {
       // bottomPipe = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("CC:\\Users\\askin\\OneDrive\\Masa¸st¸\\asli oyun\\roots.jpg"));
        //topPipe = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("C:\\Users\\askin\\OneDrive\\Masa¸st¸\\asli oyun\\roots.jpg"));
        try {
            bottomPipe = ImageIO.read(getClass().getResourceAsStream("/oyun1/root_yeni.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        scaleBottomPipe(initialWidth, initialHeight);
    }


    public void scaleBottomPipe(int width, int height) {
        bottomPipe = bottomPipe.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }


    public Image getPipe() {
        return bottomPipe;
    }


    public int getWidth() {
        return bottomPipe.getWidth(null);
    }


    public int getHeight() {
        return bottomPipe.getHeight(null);
    }


    public void setX(int x) {
        xLoc = x;
    }


    public int getX() {
        return xLoc;
    }


    public void setY(int y) {
        yLoc = y;
    }


    public int getY() {
        return yLoc;
    }


    public Rectangle getRectangle() {
        return (new Rectangle(xLoc, yLoc, bottomPipe.getWidth(null), bottomPipe.getHeight(null)));
    }


    public BufferedImage getBI() {
        BufferedImage bi = new BufferedImage(bottomPipe.getWidth(null), bottomPipe.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        g.drawImage(bottomPipe, 0, 0, null);
        g.dispose();
        return bi;
    }
}