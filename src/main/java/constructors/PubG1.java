package constructors;

public class PubG1 {//ULC
	public static void main(String[] args) {
		Guns s=new Guns();//Object created with unparameterised constructor
		s.carName="Audi";//variable initialized
		s.noOfWheels=4;//initialization
		s.Car();//non static method calling from diff class
		s.math();
	}

}
