import java.util.ArrayList;

public class PhotoCollection {
    private ArrayList<Photo> photos = new ArrayList<>();
    private String baseFilePath = "/Users/andrewbahsoun/Desktop/photos_I_like";
    private String[] arr1={"SAM_0120.JPG", "SAM_0127.JPG", "SAM_0143.JPG", "SAM_0151.JPG", "SAM_0170.JPG", "SAM_0177.JPG"};

    public PhotoCollection() {
        fillPhotos();
    }
    
    private void fillPhotos() {
        for (int i = 0; i < arr1.length; i++) {
            photos.add(new Photo(baseFilePath + arr1[i], 500, 375));
        }

    }
    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public void removePhoto(Photo photo) {
        photos.remove(photo);
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    // Possibly methods to sort, search, filter, etc.
}
