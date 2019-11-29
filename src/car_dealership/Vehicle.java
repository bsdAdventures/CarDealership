package car_dealership;

public class Vehicle {
	
	private String make;
	private String model;
	private int year;
	private String color;
	private int price;

	
	
	
	public Vehicle(String make, String model, int year, String color, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price
				+ "]";
	}
	public void honk() {
		System.out.println("Beep Beep");
	}
	
	public void showCarDetail() {
		
		System.out.println( year + " " + make + " " + model);
		System.out.println(" color: " + color);
		System.out.println(" Price:  $" + price);
	}

}
