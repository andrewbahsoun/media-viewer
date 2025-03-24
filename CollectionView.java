import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CollectionView extends JFrame {
    private int frameWidth;
    private int frameHeight;  
    private String folderName;

    public CollectionView() {
        this.frameWidth = 1000;
        this.frameHeight = 1000;
        setTitle("Default View");
        display();
    }
    public CollectionView(int width, int height, String folderName) {
        this.frameWidth = width;
        this.frameHeight = height;
        this.folderName = folderName;
        setTitle(folderName + " Photos");
        display();
    }
    public void display() { 
        // basic Jframe start operations
        setLayout(new FlowLayout());
        setSize(frameWidth,frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create photos ArrayList
        PhotoCollection Seville = new PhotoCollection(folderName);
        ArrayList<Photo> photos = Seville.getPhotos(); 
    
        //displays collection and adds Next button
        displayCollection(photos);
        
        setVisible(true);
    }

    private void displayCollection(ArrayList<Photo> collection) {
        // creates a photoPanel with the first image
        PhotoDisplayPanel photoPanel = new PhotoDisplayPanel(collection.get(0));
        photoPanel.resetPhoto(collection.get(0));


        // Create a show button to show first photo

        // Creates a num counter
        PhotoViewerController numController = new PhotoViewerController();

        // creates a button that updates the photo when pressed
        NextButton btnNext = new NextButton(collection, photoPanel, getContentPane(), numController);
        PrevButton btnPrev = new PrevButton(collection, photoPanel, getContentPane(), numController);

        btnNext.doClick();

        //adds the button to the jfra e
        add(btnNext); 
        add(btnPrev);
        add(photoPanel);
    }
}
