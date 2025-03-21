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
        // basic Jframe start operations
        setLayout(new FlowLayout());
        setSize(frameWidth,frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create photos ArrayList
        PhotoCollection testCollection = new PhotoCollection();
        ArrayList<Photo> photos = testCollection.getPhotos(); 

        //displays collection and adds Next button
        displayCollection(photos);
        
        setVisible(true);
    }

    private void displayCollection(ArrayList<Photo> collection) {
        // creates a photoPanel with the first image
        PhotoDisplayPanel photoPanel = new PhotoDisplayPanel(collection.get(0));

        // creates a button that updates the photo when pressed
        NextButton btnNext = new NextButton(collection, photoPanel, getContentPane());

        //adds the button to the jfra e
        add(btnNext);
    }
}
