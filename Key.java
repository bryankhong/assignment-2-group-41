import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Key extends Entity {
	
	protected boolean hasKey;
	
	public Key (int x, int y, Color colour) {
		super(x, y);
		this.colour = colour;
	}
	
	public String toString() {
		String result = "This is a key";
		result += super.toString();
		return result;
	}
	
	public void pickUp() {
		hasKey = true;
	}
}
