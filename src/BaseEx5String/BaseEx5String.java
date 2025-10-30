package BaseEx5String;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseEx5String {
	
	public static void simpleConcat(String string1, String string2) {
		String completeThong;
		
		completeThong = string1 + string2;
		System.out.println("1st concatenation : " + completeThong);
	}
	
	public static void addConcat(String string1, String string2) {
		String completeThong = "";
		
		completeThong += string1;
		completeThong += string2;
		System.out.println("2nd concatenation : " + completeThong);
	}
	
	public static void tabConcat(ArrayList<String> tabString) {
		String completeThong = "";
		
		for(int i =0; i < tabString.size(); i++) {
			completeThong += tabString.get(i);
		}
		System.out.println("3rd concatenation : " + completeThong);
	}
	
	public static boolean searchString(String sentence, String word) {
		if(sentence.contains(word)) {
			System.out.println("String found !");
			return true;
		}else {
			System.out.println("String not found !");
			return false;
		}
	}
	
	public static void replaceString(String sentence, String oldString) {
		Scanner scan = new Scanner(System.in);
		String newString;
		System.out.println("What word would you like to replace 'teapot' with ?");
		newString = scan.nextLine();
		System.out.println("New sentence : " + sentence.replaceAll(oldString, newString));
		scan.close();
	}
	
	public static boolean reverseString(String sentence) {
		String reversedString = "";
		// To check if a sentence is a palindrome, we have to lowercase the sentence and to delete the spaces
		sentence = sentence.toLowerCase();
		sentence = sentence.replaceAll(" ", "");
		for(int i = 0; i < sentence.length(); i++) {
			reversedString = sentence.charAt(i) + reversedString;
		}
		return sentence.equals(reversedString);
	}

	public static void main(String[] args) {
		// Strings
		String thong1 = "HTTP error 418 : ";
		String thong2 = "I'm a teapot.";
		
		System.out.println("--------------------------------------");
		System.out.println("Concatenations");
		System.out.println("--------------------------------------");
		// 1st concat
		simpleConcat(thong1, thong2);
		
		// 2nd concat
		addConcat(thong1, thong2);
		
		// 3rd concat
		ArrayList<String> tabConcat = new ArrayList<>();
		tabConcat.add(thong1);
		tabConcat.add(thong2);
		tabConcat(tabConcat);
		
		// To search a string
		searchString(thong1 + thong2, "teapot");
		
		// Replace word
		String completeThong = thong1 + thong2;
		
		if(searchString(thong1 + thong2, "teapot")){
			//replaceString(completeThong, "teapot");
		}
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		System.out.println("--------------------------------------");
		System.out.println("Palindrome Syndrome");
		System.out.println("--------------------------------------");
		
		String palindrome = "Elu par cette crapule";
		if(reverseString(palindrome)) {
			System.out.println("The word '" + palindrome + "' is a palindrome.");
		}else {
			System.out.println("The word '" + palindrome + "' is not a palindrome.");
			
		}
	}

}
