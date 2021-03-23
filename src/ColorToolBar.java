import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorToolBar extends JToolBar {

    private DrawArea drawArea;

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };

    public ColorToolBar(DrawArea area)
    {
        this.drawArea = area;
    }

}
