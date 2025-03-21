import javax.swing.*;
import java.awt.*;

public class Photo {
    private String filePath;
    private int width; 
    private int height; 
    private ImageIcon scaledIcon;

    public Photo() {

    }
    public Photo(String filePathI, int widthI, int heightI) {
        this.filePath = filePathI;
        this.width = widthI;
        this.height = heightI;

        createImageIcon();

    }
    
    public void createImageIcon() {
        ImageIcon originalIcon = new ImageIcon(filePath);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        this.scaledIcon = scaledIcon;
    }

    public ImageIcon getImageIcon() {
        return this.scaledIcon;
    }

}
