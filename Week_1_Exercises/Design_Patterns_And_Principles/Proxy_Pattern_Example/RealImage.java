package ProxyPatternExample;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading the image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying the image: " + filename);
    }
}
