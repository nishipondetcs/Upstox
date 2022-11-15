package constructors;

public class Score {
public static void main(String[] args) {
	T20 j=new T20();
	j.boundaryname="six";//variable initialized in diff cass
	T20.noOfBoundaries=7;//variable initialized in diff cass
	j.Boundaries();//static method called from another class
	
}
}
