import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class PhotoCollection {

    private String baseFilePath = "/Users/andrewbahsoun/Desktop/Abroad_Photos";
    private String folderName;
    private ArrayList<Photo> photos = new ArrayList<>();

    public PhotoCollection(String folder) {
        try {
            // Automatically generate the list of JPG files in the Seville folder
            this.folderName = folder;
            String[] FileNames = getFiles(folderName);
            fillPhotos(FileNames);
        } catch (IOException ex) {
            System.out.println("Photo not found... error: " + ex.getMessage());
        }
    }
    
    /**
     * For each filename in the collection (expected in the format "/Seville/filename.JPG"),
     * create a Photo with the absolute path and add it to the photos list.
     */
    private void fillPhotos(String[] collection) throws IOException {
        for (int i = 0; i < collection.length; i++) {
            // collection[i] is in the format "/Seville/SAM_xxxx.JPG"
            // Construct the absolute path:
            String absolutePath = baseFilePath + collection[i];
            photos.add(new Photo(absolutePath, 750, 562));
        }
    }
    
    /**
     * Lists all files ending in .JPG in the Seville folder and returns an array of strings
     * in the format "/Seville/filename.JPG".
     */
    private String[] getFiles(String folder) throws IOException {
        String directoryPath = baseFilePath + "/" + folder;
        File folderDir = new File(directoryPath);
        File[] files = folderDir.listFiles();
        if (files == null) {
            throw new IOException("Directory not found: " + directoryPath);
        }
        ArrayList<String> fileList = new ArrayList<>();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".JPG")) {
                fileList.add("/" + folder + "/" + file.getName());
            }
        }
        return fileList.toArray(new String[0]);
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
