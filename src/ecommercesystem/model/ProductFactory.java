package ecommercesystem.model;

public class ProductFactory {
    public static Product createProduct(String type, String name, String description, double price, String imagePath) {
        switch (type) {
            case "Electronics":
                return new Electronics(name, description, price, imagePath);
            case "Clothing":
                return new Clothing(name, description, price, imagePath);
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}