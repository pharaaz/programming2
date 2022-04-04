package week09;

import java.util.HashSet;

public class SetFilter {
	public static void main(String[] args) {
		HashSet<String> words = new HashSet<String>();
		words.add("abc");
		words.add("defgabc123");
		words.add("qwerty");
		HashSet<String> filterWords = filter(words,"abc");
		System.out.println(filterWords);
	}

	private static HashSet<String> filter(HashSet<String> words, String term) {
		HashSet<String> filterWords = new HashSet<String>();
		
		for(String letter : words) {
			if(letter.contains(term)) {
				filterWords.add(letter);
			}
		}
		return filterWords;
	}

}
