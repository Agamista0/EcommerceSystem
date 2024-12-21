package ecommercesystem.model;

public class Clothing implements Product {
	private String type = "Clothings";
    private String name = "CloName";
    private String description = "Nylon cloth";
    private double price = 20;
    private String imagePath= "/EcommerceSystem/src/ecommercesystem/images/download (1).jpeg";

    public Clothing() {}
    
    public Clothing(String name, String description, double price, String imagePath) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagePath = imagePath;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

	@Override
	public String getType() {
		
		return type;
	}

	@Override
	public String getImagePath() {
		// TODO Auto-generated method stub
		return imagePath;
	}
	
	
}