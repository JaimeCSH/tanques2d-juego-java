package sprite;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Sprite {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean vis;
	protected Image image;

	public Sprite(int x, int y) {

		this.x = x;
		this.y = y;
		vis = true;
	}

	public void loadImage(String imageName) {

		ImageIcon ii = new ImageIcon(imageName);
		image = ii.getImage();
	}

	protected void getImageDimensions() {

		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	public Image getImage() {
		return image;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isVisible() {
		return vis;
	}

	public void setVisible(Boolean visible) {
		vis = visible;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
}
