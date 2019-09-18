package data.chapter9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
    
	public static void main(String[] args) {
	  System.out.println("input word:");
	   Scanner input = new Scanner(System.in);
	   String word = input.nextLine();
	   Set words = tokenSet(word);
	  System.out.printf("%d ge not repeat words,%s",words.size(),words ); 
	}

	public static Set tokenSet(String line) {
		String[] words = line.split(" ");
		List<String> wordList = Arrays.asList(words);
		return new HashSet(wordList);
	}
}
