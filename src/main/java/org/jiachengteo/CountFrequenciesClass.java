package org.jiachengteo;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountFrequenciesClass {
	public static void main(String[] args) {

		int[] frequencies = countFrequencies(new String[] { "apple", "banana", "apple", "orange", "banana", "apple" });
		System.out.println(Arrays.toString(frequencies));
	}

	public static int[] countFrequencies(String[] words) {
		// Use a TreeMap to sort words alphabetically
		Map<String, Integer> wordCounts = new TreeMap<>();

		// Count the occurrences of each word
		for (String word : words) {
			wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
		}

		// Convert the values of the map to an array
		int[] frequencies = new int[wordCounts.size()];
		int index = 0;
		for (int count : wordCounts.values()) {
			frequencies[index++] = count;
		}

		return frequencies;
	}
}
