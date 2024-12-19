package ecommercesystem.model;

public class SeasonalDiscountDecorator extends ProductDiscountDecorator {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return decoratedProduct.getName() + "With 30% offer";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return decoratedProduct.getDescription() + " with new price of " + String.valueOf(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return decoratedProduct.getPrice() * 0.3 ;
	}

	public SeasonalDiscountDecorator(Product decoratedProduct) {
		super(decoratedProduct);
		// TODO Auto-generated constructor stub
	}
    
}