import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PhotoDisplayPanel extends JPanel {

    private Photo photo;
    private JLabel photoLabel;

    public PhotoDisplayPanel(Photo newPhoto) {
        this.photo = newPhoto;

    }
    public void createImageIconAndAddToPanel() {
        // Have the Photo create its ImageIcon
        photo.createImageIcon();
        
        // Create a JLabel using the Photo's ImageIcon
        photoLabel = new JLabel(photo.getImageIcon());
        
        // Add the label to this panel
        removeAll();
        add(photoLabel);
    }

    public void resetPhoto(Photo newPhoto) {
        this.photo = newPhoto; 
        createImageIconAndAddToPanel();
    }
}



