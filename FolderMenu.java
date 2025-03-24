import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FolderMenu extends JFrame {
    private int frameHeight;
    private int frameWidth;   


    public FolderMenu() { 

    }

    public FolderMenu(int frameHeight, int frameWidth) {
        this.frameHeight = frameHeight;
        this.frameWidth = frameWidth; 

        displayMainMenu();

    }

    public void displayMainMenu() {
        setLayout(new FlowLayout());
        setSize(frameWidth,frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FolderButton SevilleButton = new FolderButton("Seville");
        FolderButton PicosButton = new FolderButton("Picos");
        FolderButton Digital_Camera_Extras_Button = new FolderButton("Digital_Camera_Extras");
        FolderButton ZermattButton = new FolderButton("Zermatt");
        FolderButton BerlinButton = new FolderButton("Berlin");
        FolderButton Garrett_VisitButton = new FolderButton("Garrett_Visit");
        FolderButton MadridButton = new FolderButton("Madrid");
        FolderButton GijonOviedoButton = new FolderButton("Gijon_Oviedo");
        FolderButton IrelandButton = new FolderButton("Ireland");
        FolderButton SegoviaButton = new FolderButton("Segovia");
        

        add(SevilleButton);
        add(PicosButton);
        add(Digital_Camera_Extras_Button);
        add(ZermattButton);
        add(BerlinButton);
        add(Garrett_VisitButton);
        add(MadridButton);
        add(GijonOviedoButton);
        add(IrelandButton);
        add(SegoviaButton);
        
        revalidate();
        repaint();

        setVisible(true);
    }

    
}
