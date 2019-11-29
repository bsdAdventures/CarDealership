package car_dealership;


public class Customer {
	
	private String name;
	private String address;
	private Double cashOnHand;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Double getCashOnHand() {
		return cashOnHand;
	}



	public void setCashOnHand(Double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}



	
	public void purchaseCar(Customer cust,Vehicle vehicle, Employee emp, boolean finance ) {
		
		
		emp.handleCustomer( this, finance, vehicle, emp);
		
	}



	

}
