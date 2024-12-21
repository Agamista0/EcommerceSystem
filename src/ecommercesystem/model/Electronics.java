package ecommercesystem.model;

public class Electronics implements Product {
	private String type = "Electronics";
    private String name = "Electro";
    private String description = "Electronics";
    private double price = 10;
    private String imagePath = "/EcommerceSystem/src/ecommercesystem/images/download.png";

    public Electronics() {}
    
    
    public Electronics(String type, String name, String description, double price, String imagePath) {
    	this.type = type;
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
