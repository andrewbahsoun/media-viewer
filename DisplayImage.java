import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class DisplayImage {

    public DisplayImage() throws IOException {
       String filePath =  "/Users/andrewbahsoun/Desktop/photos_I_like/SAM_0120.JPG";
       displayFile(filePath, 600, 400);
    }
    
    public void displayFile(String filePath, int height, int width) throws IOException {
        ImageIcon originalIcon = new ImageIcon(filePath);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);


        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(800,800);
        
        JLabel lbl=new JLabel();
        lbl.setIcon(scaledIcon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

