package basics;

public class Concatenation {

	public static void main(String[] args) {
		
		String fName = "Rafi";
		String lName = "Safa";
		
		// concatenation in Java  + 
		// concat()
		
		System.out.println(fName + " " + lName);
		
	String fullName=	fName.concat(lName);
	
	System.out.println(fullName);
	System.out.println(fName.concat(lName));
	
	int wage = 500;
	int salary = 5000;
	
	System.out.println(wage + salary);
	System.out.println(wage + " and " + salary);
	
	// .length()
	
		fName.length();
		System.out.println(fName.length());
		
	int firstName =	fName.length();
	
	System.out.println(firstName);
	
	// .toUPercase
	//.toLowerCAse
	fName.toUpperCase();
	System.out.println(fName.toUpperCase());
	
	fName.toLowerCase();
	
	System.out.println(fName.toLowerCase());
	
	String lowerCaseName =fName.toLowerCase();
	
	System.out.println(lowerCaseName);
	
	}

}
