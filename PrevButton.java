import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class PrevButton extends JButton implements ActionListener {

    private Container container; // The container where the new panel should be added
    private PhotoDisplayPanel panel; 
    private ArrayList<Photo> collection; 
    private PhotoViewerController numController; 

    public PrevButton(ArrayList<Photo> collection, PhotoDisplayPanel panel, Container container, PhotoViewerController numCounter) {

        super("Prev"); 
        // this.setPreferredSize(new Dimension(50, 10)); to change the size

        this.panel = panel; 
        this.container = container;
        this.numController = numCounter;
        this.collection = collection;
        addActionListener(this);  // Register this button as its own ActionListener

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //catches when the colleciton has no more photos left
        if (numController.getCurrentPhotoNum() == 0) {
            System.out.println("No more photos back here!");
        }
        else {
            numController.decrementNum();

            System.out.println("Prev changing photo to: " + numController.getCurrentPhotoNum());
            panel.resetPhoto(collection.get(numController.getCurrentPhotoNum())); 

            //adds to the main Jframe (which is passed in from reference during construction)
            container.add(panel);

            //revaluates the container to account for the new panel and repaints it
            container.revalidate();
            container.repaint();
        }

        


    }

}
