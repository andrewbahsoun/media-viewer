public class PhotoViewerController {
    
    private int currentPhotoNum;

    public PhotoViewerController() {
        this.currentPhotoNum = -1; 
    }

    public int getCurrentPhotoNum() {
        return currentPhotoNum; 
    }

    public void setCurrentPhotoNum(int currPhotNum) {
        currentPhotoNum = currPhotNum;
    }

    public void incrementNum() {
        currentPhotoNum = currentPhotoNum + 1;
    }

    public void decrementNum() {
        currentPhotoNum = currentPhotoNum -1; 
    }
}