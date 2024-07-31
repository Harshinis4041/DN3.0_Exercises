package BuilderPatternExample;

public class Test {
    public static void main(String[] args) {
        
        Computer gamingPC = new Computer.Builder()
            .setCPU("Intel Core i9")
            .setRAM("32GB")
            .setStorage("1TB")
            .setGPU("NVIDIA GeForce RTX 3080")
            .setSSD(true)
            .build();

        System.out.println("Gaming PC Configuration:");
        System.out.println("CPU: " + gamingPC.getCPU());
        System.out.println("RAM: " + gamingPC.getRAM());
        System.out.println("Storage: " + gamingPC.getStorage());
        System.out.println("GPU: " + gamingPC.getGPU());
        System.out.println("SSD: " + gamingPC.isSSD());

        
        Computer officePC = new Computer.Builder()
            .setCPU("Intel Core i5")
            .setRAM("8GB")
            .setStorage("500GB")
            .build();

        System.out.println("\nOffice PC Configuration:");
        System.out.println("CPU: " + officePC.getCPU());
        System.out.println("RAM: " + officePC.getRAM());
        System.out.println("Storage: " + officePC.getStorage());
        System.out.println("GPU: " + officePC.getGPU()); 
        System.out.println("SSD: " + officePC.isSSD());  
    }
}
