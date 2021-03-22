import java.awt.*;

public abstract class Tool
{
    public Tool() { }

    public Tool(Image img)
    {
        this.setGraphics(img);
    }

    protected int currentX, currentY, oldX, oldY;
    protected Graphics2D graphics;

    public abstract void draw();

    public void updateCurrentCoords(int newX, int newY) {currentX = newX; currentY = newY;}
    public void updateOldCoords(int newX, int newY) {oldX = newX; oldY = newY;}

    public int GetOldX() { return oldX; }
    public int GetOldY() { return oldY; }

    public int GetCurrentX() { return currentX; }
    public int GetCurrentY() { return currentY; }

    public void setColor(Color color) { graphics.setPaint(color); }
    public void fillRect(int x1, int y1, int x2, int y2) { graphics.fillRect(x1, y1, x2, y2); }

    public void setGraphics(Image img) { graphics = (Graphics2D) img.getGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

}
