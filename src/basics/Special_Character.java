package basics;

public class Special_Character {

	public static void main(String[] args) {
		/*
		 * The sequence \"  inserts a double quote in a string: Example String txt =
		 * "We are the so-called \"Vikings\" from the north.";
		 * 
		 * The sequence \'  inserts a single quote in a string: Example String txt =
		 * "It\'s alright.";
		 * 
		 * The sequence \\  inserts a single backslash in a string: Example String txt =
		 * "The character \\ is called backslash.";
		 * 
		 * String txt = "We are the so-called "Vikings" from the north.";
		 */
		
		String doubleQuote = " Kabuul is the \"Capital\" of Afg " ;
		
		System.out.println(doubleQuote);
		
		String abc = " It's alright";
		String singleQuote = " It\'s alright";
		System.out.println(abc);
		System.out.println(singleQuote);
		
		String backslash = " Afghanistan\\capital";
		System.out.println(backslash);
		
		String newLine = " It is a new line \n33333 ";
		System.out.println(newLine);
		
		String tab = " My name is Rafi\t and my lastName is \t Safa	";
		System.out.println(tab);
		
		String backspace = " Javaa\b  training";
		System.out.println(backspace);
		
		
	}

}
