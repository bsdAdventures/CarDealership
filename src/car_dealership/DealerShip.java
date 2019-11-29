package car_dealership;

public class DealerShip {

	public static void main(String[] args) {

		Customer cust = new Customer();
		
		cust.setName("Chris");
		cust.setAddress("400 south dallas dr, Dallas tx, 75034");
		cust.setCashOnHand(10000.68);
		
		Vehicle acura = new Vehicle("Acura","TL",2020, "red", 45000);
		Vehicle honda = new Vehicle("Honda","Civic",2019, "red", 20000);
		Vehicle honda1 = new Vehicle("Honda","Civic",2019, "red", 20000);
		
		Employee emp = new Employee("Mike Smith", "Sales Rep");
		Employee emp1 = new Employee("Jones Dow", "Sales Manager");
		
		
		
	
		
		
		cust.purchaseCar(cust,acura, emp, true);
		cust.purchaseCar(cust,honda, emp1, false);
		
		
		boolean testEquality =  honda.equals(honda1);
		
		System.out.println(testEquality);

	}

}
