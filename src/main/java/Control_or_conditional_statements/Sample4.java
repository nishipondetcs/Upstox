package Control_or_conditional_statements;

public class Sample4 {
public static void main(String[] args) {
	switch("IDLI") {
	case "IDLI" :{//case will give output only if it matches with switch
		System.out.println("on sunday");
	}
	case "UTTAPPA" :{
		System.out.println("on monday");
	}
	case "MEDUVADA" :{
		System.out.println("on tuuesday");
			}
	case "DOSA" :{
		System.out.println("on wednesday");
			}break;// breaks from here
			
	case "SAMOSA" :{
		System.out.println("on thursday");
		
	}
	case "KACHORI" :{
		System.out.println("on friday");
		
	}
	case "MISAL" :{
		System.out.println("on saturday");
	}
	default :{
		System.out.println("No Breakfast");
	} 
	}
}
}
