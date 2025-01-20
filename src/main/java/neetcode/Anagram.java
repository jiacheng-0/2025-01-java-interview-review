package neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		char[] sArray = s.toCharArray(), tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);

		return Arrays.equals(sArray, tArray);
		// HashMap <Character, Integer> hm = new HashMap<>();
		// for (int i = 0; i < s.length(); i++) {
		// 	Character c = s.charAt(i);
		// 	if (!hm.containsKey(c))
		// 		hm.put(c, 1);
		// 	else
		// 		hm.put(c, hm.get(c) + 1);
		// }
	}
}
