package ecommercesystem.model;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "Electronics":
                return new Electronics();
            case "Clothing":
                return new Clothing();
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}