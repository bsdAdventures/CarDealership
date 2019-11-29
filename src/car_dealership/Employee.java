package car_dealership;



public class Employee {
	private String name;
	private String jobTitle;
	
	
	
	

	public Employee(String name, String jobTitle) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
	}
	
	

	

	@Override
	public String toString() {
		return  name + ", i am a " +  jobTitle ;
	}





	public static int getRandom(int min, int max) {
		return (int) ((Math.random() * (max + 1 - min)) + min);
	}
	
	
	

	public int runCreditHistory(Customer cust, double loanAmount) {

		int n = getRandom(400,800);

		if (n >= 670) {

			System.out.println("Your are Approved " + cust.getName() + ", your credit score is " + n
					+ ". Loan amount of  " + loanAmount + " is ready for you.");

		} else {

			System.out.println("Financing is unavliable due to a credit score of " + n);
		}

		return n;

	}
	
	
	

	public void processTransaction(Customer cust, Vehicle vehicle) {

		System.out.println(cust.getName() + ", thanks for your purchase, enjoy your new" + vehicle);
		
		vehicle.honk();

	}
	
	
	
	
	

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle, Employee emp) {

		if (cust.getCashOnHand() > vehicle.getPrice()) {
			double moneyLeft = cust.getCashOnHand() - vehicle.getPrice();
			
			System.out.println("Hi my name is " + emp );

			System.out.println("You can purchase a car without financing and would have " + moneyLeft + " left over.");

		} else {
			if (finance == true) {

				System.out.println("You have " + cust.getCashOnHand()
						+ " cash on hand, lets check your credit to get you approved.");

				double loan = vehicle.getPrice() - cust.getCashOnHand();

				int creditScore = runCreditHistory(cust, loan);

				if (creditScore >= 650) {

					processTransaction(cust, vehicle);

				}

			} else if (vehicle.getPrice() <= cust.getCashOnHand()) {

				processTransaction(cust, vehicle);
				vehicle.honk();

			} else {

				System.out.println("Please come back when you have more money to purchase a vehicle");

			}

		}

	}

}
