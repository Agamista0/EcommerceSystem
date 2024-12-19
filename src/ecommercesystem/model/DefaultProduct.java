package ecommercesystem.model;

public class DefaultProduct implements Product{
    @Override
    public String getName(){
        return "Default product";
    }

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}