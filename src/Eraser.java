import java.awt.*;

public class Eraser extends Tool{

    public Eraser(Image img)
    {
        graphics =  (Graphics2D) img.getGraphics();
        graphics.setPaint(Color.white);
        System.out.println(graphics.getPaint());
    }

    @Override
    public void draw() {
        this.graphics.drawOval(currentX, currentY, 5, 5);
        this.graphics.fillOval(currentX, currentY, 5, 5);
    }
}
