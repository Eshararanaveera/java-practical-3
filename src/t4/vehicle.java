package t4;

public class vehicle {

	String model;
	double rentalpriceDay;
	
	public vehicle(String model1,double retal1) {
		model=model1;
		rentalpriceDay=retal1;
		
		
	}
	
	public double calcu(int days) {
		return days*rentalpriceDay;
	}
	
}
