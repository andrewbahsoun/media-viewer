import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

public class FolderButton extends JButton implements ActionListener {

    private String folderName;

    public FolderButton(String folderName) {
        super(folderName);
        this.folderName = folderName;
        addActionListener(this);  // Register this button as its own ActionListener

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //open a JFrame of the folder
        CollectionView cv = new CollectionView(1000,1000, folderName);
    }

}
