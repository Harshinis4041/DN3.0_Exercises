package ProxyPatternExample;

public class ProxyImage2 implements Image {
    private RealImage realImage;
    private String filename;
    private boolean isLoaded = false;

    public ProxyImage2(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        try {
            if (!isLoaded) {
                System.out.println("Proxy: Loading image: " + filename);
                realImage = new RealImage(filename);
                isLoaded = true;
            } else {
                System.out.println("Proxy: Displaying cached image: " + filename);
            }
            realImage.display();
        } catch (Exception e) {
            System.err.println("Error in Proxy while displaying image: " + filename);
            e.printStackTrace();
        }
    }
}
