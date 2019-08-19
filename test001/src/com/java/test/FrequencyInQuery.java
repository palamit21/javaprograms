package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyInQuery {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 3, 3};
		List<Integer> al = Arrays.asList(a);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> al1 = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			al1.addAll(al);

		}

		System.out.println(al1);

		queryBuilder(map, al1);
		System.out.println(map);
		int key = maxOccurence(map);
		System.out.println(key);

	}

	private static void queryBuilder(Map<Integer, Integer> map, List<Integer> al1) {
		for (int j = 7; j <=7; j++) {

			if (!map.containsKey(al1.get(j))) {
				map.put(al1.get(j), 1);

			} else {
				map.put(al1.get(j), map.get(al1.get(j)) + 1);

			}

		}
	}

	private static int maxOccurence(Map<Integer, Integer> map) {
		int count = 0;
		int maxKey = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > count || entry.getValue() == count) {
				count = entry.getValue();
				maxKey = entry.getKey();
			}

		}
		return maxKey;
	}
}
