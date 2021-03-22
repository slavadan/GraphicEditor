import javax.swing.*;
import java.awt.*;

public class Application {


    DrawArea drawArea;

    public static void main(String[] args) {
        new Application().launch();
    }

    public void launch() {



        JFrame frame = new JFrame("Swing Paint");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container content = frame.getContentPane();

        content.setLayout(new BorderLayout());

        drawArea = new DrawArea();


        ToolBar toolBar = new ToolBar(frame, drawArea);

        content.add(toolBar, BorderLayout.NORTH);
        content.add(drawArea, BorderLayout.CENTER);




        frame.setVisible(true);


    }
}
