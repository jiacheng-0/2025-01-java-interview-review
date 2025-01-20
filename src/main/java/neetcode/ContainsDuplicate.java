package neetcode;

import java.util.HashSet;

public class ContainsDuplicate {
	public static boolean main(String[] args) {
		int[] nums = null;
		HashSet<Integer> hset = new HashSet<>();

		for (int num: nums) {

			if (!hset.add(num)) {
				return true;
			}
		}
		return false;
	}

	public static boolean mainV1(String[] args) {
		int[] nums = null;
		HashSet<Integer> hset = new HashSet<>();

		for (int num: nums) {
			if (hset.contains(num)) {
				return true;
			} else {
				hset.add(num); // this method returns true if this set did not already contain the specified element
			}
		}
		return false;
	}
}
