import javax.swing.*;
import java.awt.*;

public class Application {

    DrawArea drawArea;

    public static void main(String[] args) {
        new Application().launch();
    }

    public void launch() {


        JFrame frame = new JFrame("Swing Paint");
        Container content = frame.getContentPane();

        content.setLayout(new BorderLayout());
        // create draw area
        drawArea = new DrawArea();

        // add to content pane
        content.add(drawArea, BorderLayout.CENTER);

        // create controls to apply colors and call clear feature
        JPanel controls = new JPanel();


        // add to content pane
        content.add(controls, BorderLayout.NORTH);

        frame.setSize(600, 600);
        // can close frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // show the swing paint result
        frame.setVisible(true);

        // Now you can try our Swing Paint !!! Enjoy :D
    }
}
