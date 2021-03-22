import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;;


public class DrawArea extends JComponent {

    private Image image;
    private Tool tool = new Pencil();

    public DrawArea()
    {
        setDoubleBuffered(false);
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                tool.updateOldCoords(e.getX(), e.getY());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                tool.updateCurrentCoords(e.getX(), e.getY());

                if(tool != null)
                {
                    tool.draw();
                    repaint();
                    tool.updateOldCoords(tool.GetCurrentX(), tool.GetCurrentY());//??????
                }
            }
        });

    }

    protected void paintComponent(Graphics g)
    {
        if(image == null)
        {
            image = createImage(getSize().width, getSize().height);
            tool.setGraphics(image);
            clear();
        }

        g.drawImage(image, 0, 0, null);
    }

    public void changeTool(Tool nTool)
    {
        tool = nTool;
    }

    public void clear() {
        tool.setColor(Color.white);
        tool.fillRect(0, 0, getSize().width, getSize().height);
        tool.setColor(Color.black);
        repaint();
    }

    public Image getImage() { return image; }

}
