import java.awt.*;

public class Pencil extends Tool{

    public Pencil() { }

    public Pencil(Image img) { super(img); }

    @Override
    public void draw() {
        this.graphics.drawLine(oldX, oldY, currentX, currentY);
    }

}
