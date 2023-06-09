package oyun1_kus;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TopPipe {
	// global variables
	private Image topPipe;
	private int xLoc = 0, yLoc = 0;

	public TopPipe(int initialWidth, int initialHeight) {
		// topPipe =
		// Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("C:\\Users\\askin\\OneDrive\\Masaüstü\\asli
		// oyun\\roots.jpg"));
		try {
			topPipe = ImageIO.read(getClass().getResourceAsStream("/oyun1/root_yeni.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		scaleTopPipe(initialWidth, initialHeight);

	}

	public void scaleTopPipe(int width, int height) {
		topPipe = topPipe.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	}

	public Image getPipe() {
		return topPipe;
	}

	public int getWidth() {
		return topPipe.getWidth(null);
	}

	public int getHeight() {
		return topPipe.getHeight(null);
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
		return (new Rectangle(xLoc, yLoc, topPipe.getWidth(null), topPipe.getHeight(null)));
	}

	public BufferedImage getBI() {
		BufferedImage bi = new BufferedImage(topPipe.getWidth(null), topPipe.getHeight(null),
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.getGraphics();
		g.drawImage(topPipe, 0, 0, null);
		g.dispose();
		return bi;
	}
}