package Ecommerce_Platform_Search;

public class ProductItem {
    private int productId;
    private String productName;
    private String category;

    public ProductItem(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "ProductItem [ID = " + productId + ", Name = " + productName + ", Category = " + category + "]";
    }
}
