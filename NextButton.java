import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class NextButton extends JButton implements ActionListener {

    private Container container; // The container where the new panel should be added
    private PhotoDisplayPanel panel; 
    private ArrayList<Photo> collection; 
    private int currentPhotoNum;

    public NextButton(ArrayList<Photo> collection, PhotoDisplayPanel panel, Container container) {

        super("Next"); 
        // this.setPreferredSize(new Dimension(50, 10)); to change the size

        this.panel = panel; 
        this.container = container;
        this.currentPhotoNum = 0; 
        this.collection = collection;
        addActionListener(this);  // Register this button as its own ActionListener
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //catches when the colleciton has no more photos left
        try {
            panel.resetPhoto(collection.get(currentPhotoNum)); 
        }
        catch(ArrayIndexOutOfBoundsException exception) { 
            //future work... create some kind of action that disables the button
            //future work.. could also just not allow to be pressed when currentPhotoNum = len(collection)
            System.out.println("No more photos in the colleciton");
        }

        //adds to the main Jframe (which is passed in from reference during construction)
        container.add(panel);

        //revaluates the container to account for the new panel and repaints it
        container.revalidate();
        container.repaint();

        // keeps track of the current photo
        this.currentPhotoNum++;
    }
}
