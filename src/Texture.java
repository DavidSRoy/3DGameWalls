import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
	static String path = "C:\\Home\\David\\Java\\3DGameWalls\\src\\";
	public static Texture wood = new Texture(path + "pics\\woodFence.jpg", 224);
	public static Texture brick = new Texture(path +"pics\\brick.jpg", 64);
	public static Texture stone1 = new Texture(path + "pics\\stone.jpg", 1196);
	public static Texture stone2 = new Texture(path + "pics\\stone2.jpg", 300);

	public int[] pixels;
	private String loc;
	public final int SIZE;
	
	public Texture(String location, int size) {
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}