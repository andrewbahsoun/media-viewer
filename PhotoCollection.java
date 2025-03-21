import java.util.ArrayList;
import java.io.IOException;

public class PhotoCollection {
    private ArrayList<Photo> photos = new ArrayList<>();
    private String baseFilePath = "/Users/andrewbahsoun/Desktop/photos_I_like/";
    private String[] collection1={"SAM_0120.JPG", "SAM_0127.JPG", "SAM_0143.JPG", "SAM_0151.JPG", "SAM_0170.JPG", "SAM_0177.JPG"};

    public PhotoCollection() {
        try {
            fillPhotos(collection1);
        }
        catch (IOException ex) {
            System.out.println("Photo not found... error..");
        }
        
    }
    
    private void fillPhotos(String[] collection) throws IOException {
        for (int i = 0; i < collection1.length; i++) {
            photos.add(new Photo(baseFilePath + collection[i], 500, 375));
        }

    }
    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public void removePhoto(Photo photo) {
        photos.remove(photo); //not sure if this will work...
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    // Possibly methods to sort, search, filter, etc.
}
