import javax.swing.*;
import java.awt.*;

public class ColorButton extends JButton {

    JButton b = new JButton("f");
    Color color;

    public ColorButton(Color setColor)
    {
        super();

        color = setColor;
        this.setBackground(color);

        this.setSize(40, 40);
    }

    public void ChangeColor(Tool tool) { tool.setColor(color); }

}
