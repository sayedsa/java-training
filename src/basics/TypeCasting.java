package basics;

public class TypeCasting {

	public static void main(String[] args) {

// Type Casting
		/*
		 * byte age = 10;
		 * 
		 * int num = age;
		 * 
		 * int salary = 10000000;
		 * 
		 * Long x = 1000000000000000L;
		 * 
		 * 
		 * // widening type casting;
		 * 
		 * float wage = 22.2f;
		 * 
		 * double w = wage;
		 * 
		 * // narrowing type casting
		 * 
		 * //larger size into smaller size
		 */
		double Wage = 222.20d;
		int x = 30;
		int wage1 = (int)Wage;
		
		/*
		 * System.out.println(Wage); System.out.println(wage1);
		 * 
		 * double x = 2000.22;
		
		int y = (int)x;
		 */
		Math.min(wage1, Wage);
		System.out.println(Math.min(x, Wage));
		

	}

}
