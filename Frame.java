import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private int frameWidth;
    private int frameHeight; 

    public Frame() {
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1000,1000);
    }

    public Frame(int width, int height) {
        this.frameWidth = width;
        this.frameHeight = height;

        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(frameWidth,frameHeight);
    }
    public void display() {
        
        // JLabel lbl=new JLabel();
        // lbl.setIcon(scaledIcon);
        // frame.add(lbl);
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
