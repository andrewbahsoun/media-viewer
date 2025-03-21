import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    private int frameWidth;
    private int frameHeight; 

    public Frame() {
        this.frameWidth = 1000;
        this.frameHeight = 1000;
        setTitle("Default Frame");
        display();
    }
    public Frame(int width, int height) {
        this.frameWidth = width;
        this.frameHeight = height;
        setTitle("Image Viewer");
        display(); 
    }
    public void display() { 
        setLayout(new FlowLayout());
        setSize(frameWidth,frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create photos ArrayList
        PhotoCollection testCollection = new PhotoCollection();
        ArrayList<Photo> photos = testCollection.getPhotos(); 

        // Create JPanels for each Photo, add them to the frame

        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // PhotoDisplayPanel currPhoto = new PhotoDisplayPanel(photos.get(0));
                PhotoDisplayPanel currPhoto = new PhotoDisplayPanel(photos.get(0));
                add(currPhoto);
                revalidate();
                repaint();
                
                //dispose();
                
            }
        });
        btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNext.setBounds(492, 505, 123, 59);
        add(btnNext);
        setVisible(true);

    }
}
