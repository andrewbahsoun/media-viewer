import javax.swing.*;
import java.awt.*;

public class Photo {
    private String filePath;
    private int width; 
    private int height; 

    public Photo() {

    }
    public Photo(String filePathI, int widthI, int heightI) {
        this.filePath = filePathI;
        this.width = widthI;
        this.height = heightI;

        ImageIcon originalIcon = new ImageIcon(filePath);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
    }

    public void getPhoto() {
        
    }
}
