package chas4;


public class zadacha1 {

	public static void main(String[] args) {
		
		String sentence = "Computer";
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println("The lenght of the word is " + sentence.length());
		System.out.println("The first letter is " + sentence.charAt(0));
		System.out.println("The last letter is " + sentence.charAt(sentence.length()-1));
		
		int len = sentence.length();
		int middle = len / 2;
		System.out.println("The middle letter is " + sentence.charAt(middle));
		
		System.out.println("The string starts with com " + sentence.startsWith("com"));
		System.out.println("The string ends with ion " + sentence.endsWith("ion"));
		System.out.println("The strings first two letters " + sentence.substring(0,2));
		System.out.println("Substituting e with o " + sentence.replaceAll("e","o"));
		System.out.println("Substituting Compu with Calculo " + sentence.replace("Compu","Calculo"));
	}

}
