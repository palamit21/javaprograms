package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquePairArray {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 45, 1, 44, 2,45,2);
		List<String> al = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		for (Integer integer : a) {

			for (Integer integer2 : a) {
				if ((integer + integer2) == 46) {

					String s = integer + "," + integer2;
					String s1 = integer2 + "," + integer;

					if ((!al.contains(s) || !al.contains(s)) && (!set.contains(s) || !set.contains(s))) {
						al.add(s);
						set.add(s1);

					}

				}

			}

		}
		System.out.println(al);
		System.out.println(al.size());

	}

}
