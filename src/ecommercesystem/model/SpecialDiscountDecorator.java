package ecommercesystem.model;

public class SpecialDiscountDecorator extends ProductDiscountDecorator {

	public SpecialDiscountDecorator(Product decoratedProduct) {
		super(decoratedProduct);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return decoratedProduct.getName() + "With 70% offer";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return decoratedProduct.getDescription() + " with new price of " + String.valueOf(getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return decoratedProduct.getPrice() * 0.7 ;
	}
	
	

}
