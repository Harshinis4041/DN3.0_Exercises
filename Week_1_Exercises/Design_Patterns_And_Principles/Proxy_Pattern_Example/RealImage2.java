package ProxyPatternExample;

public class RealImage2 implements Image {
    private String filename;

    public RealImage2(String filename) {
        this.filename = filename;
        try {
            loadImageFromServer();
        } catch (Exception e) {
            System.err.println("Error loading image from server: " + filename);
            e.printStackTrace();
        }
    }

    private void loadImageFromServer() throws Exception {
        
        System.out.println("Loading image: " + filename);
       
        // throw new Exception("Simulated error");
    }

    @Override
    public void display() {
        try {
            System.out.println("Displaying image: " + filename);
        } catch (Exception e) {
            System.err.println("Error displaying image: " + filename);
            e.printStackTrace();
        }
    }
}
