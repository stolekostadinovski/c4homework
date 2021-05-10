package javaHomeWorkC4;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.brand = "Audi";
		c1.model = "A3";
		c1.color = "Black";
		c1.year = 2004;
		c1.numberOfSeats = 5;
		c1.price = 3500; //currency Eur
		c1.transmition = 'M';
		c1.engineSize = 1.9;
		c1.fuelType="Diesel";
		
		
		Car c2 = new Car();
		c2.brand="Opel";
		c2.model="Astra";
		c2.color="White";
		c2.year=1992;
		c2.numberOfSeats=5;
		c2.transmition='M';
		c2.price=1992;
		c2.engineSize=1.4;
		c2.fuelType="Petrol";
		
System.out.println("Brand model of  Car1 " + c1.brand);
System.out.println("The color is " + c1.color);

	}

}




