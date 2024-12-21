package ecommercesystem.model;

public class ProductDiscountDecorator implements Product {
    protected Product decoratedProduct;
    
    public ProductDiscountDecorator(Product decoratedProduct){
        this.decoratedProduct = decoratedProduct;
    }
    
    @Override
    public String getName(){
        return decoratedProduct.getName();
    }
    
    @Override
    public String getDescription(){
        return decoratedProduct.getDescription();
    }

	@Override
	public double getPrice() {
		return decoratedProduct.getPrice();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return decoratedProduct.getType();
	}

	@Override
	public String getImagePath() {
		// TODO Auto-generated method stub
		return decoratedProduct.getImagePath();
	}
}