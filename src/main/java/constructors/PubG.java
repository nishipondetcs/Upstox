package constructors;

public class PubG {

	public static void main(String[] args) {// method body open
	Gun g=new Gun();//object created
	g.gunName="AK47";//variable initialized from another class with help of object
	g.noOfBullets=4;//variable initialized from another class with help of object
	g.shoot();//NSRM called from diff class with help from object
	Gun.q=856;
	System.out.println(Gun.q);
}
}

