import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        try{
            DisplayImage di = new DisplayImage();
            } catch(java.io.IOException e){
                System.out.println("createDirectory failed:" + e);
            }
        
    }
}
