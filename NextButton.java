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
        try {
            panel.resetPhoto(collection.get(currentPhotoNum)); 
        }
        catch(ArrayIndexOutOfBoundsException exception) { 
            System.out.println("No more photos in the colleciton");
        }
        container.add(panel);
        container.revalidate();
        container.repaint();
        this.currentPhotoNum++;
    }
}
