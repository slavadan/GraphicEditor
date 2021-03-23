import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JToolBar {

    private DrawArea drawArea;
    private JButton pencilButton, eraserButton, rectangleButton, circleButton, lineButton;

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == pencilButton)
            {
                drawArea.changeTool(new Pencil(drawArea.getImage()));
            }
            else if(e.getSource() == eraserButton)
            {
                drawArea.changeTool(new Eraser(drawArea.getImage()));
            }
        }
    };

    public ToolBar(JFrame mainFrame, DrawArea area)
    {

        drawArea = area;

        pencilButton = new JButton(new ImageIcon("src/images/pencil.png"));
        pencilButton.addActionListener(actionListener);

        eraserButton = new JButton(new ImageIcon("src/images/eraser.png"));
        eraserButton.addActionListener(actionListener);

        rectangleButton = new JButton(new ImageIcon("src/images/rectangle.png"));
        rectangleButton.addActionListener(actionListener);

        circleButton = new JButton(new ImageIcon("src/images/circle.png"));
        circleButton.addActionListener(actionListener);

        lineButton = new JButton(new ImageIcon("src/images/line.png"));
        lineButton.addActionListener(actionListener);

        System.out.println(lineButton.getSize());

        this.add(pencilButton);
        this.add(eraserButton);
        this.add(circleButton);
        this.add(rectangleButton);
        this.add(lineButton);

        this.setFloatable(false);
        this.setRollover(false);

        this.setSize(mainFrame.getSize().width, 90);

    }


}
