package com.java.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IfElseTest {

	public static void main(String[] args) throws Throwable {
		Deque<Integer> dq= new LinkedList<>();


		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "ABC");
		hmap.put(2, "XCB");
		hmap.put(4, "ZIO");
		hmap.put(3, "ABC");
		
		hmap.put(1, "CBA");
		System.out.println(hmap);

		Map<Integer, String> result = hmap.entrySet().stream().filter(p -> p.getKey().intValue() <= 4)
				.filter(p -> p.getValue().startsWith("A"))
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		System.out.println("Result: " + result);
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();

		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
				new Person("lawrence", 40));

		String name = persons.stream().filter(x -> "jack".equals(x.getName())).map(Person::getName) // convert stream to
																									// String
				.findAny().orElse("");
		Integer age;
		age = persons.stream().filter(x -> x.getAge() == 30).map(Person::getAge).findAny().orElse(0);
		System.out.println("sorted by age");
		persons.stream().sorted((Person p1, Person p2) -> p2.getAge() - p1.getAge()).forEach(System.out::println);

		System.out.println("sorted by name");
		persons.stream().sorted((Person p1, Person p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(System.out::println);

		System.out.println("name 1 : " + name + " age" + age.toString());

		List<Integer> collect = persons.stream().map(Person::getAge).collect(Collectors.toList());
		collect.forEach(System.out::println);
		persons.stream().map(i -> new Person(i.getName(), i.getAge())).collect(Collectors.toList());
		// List<Dog> dogList=
		// persons.stream().map(Dog::new).collect(Collectors.toList());

		/*Rating[] ratings = RatingFile.readFile(FILE_NAME);
		return Arrays.stream(ratings).collect(Collectors.groupingBy(Rating::getOutletCode, Collectors.groupingBy(Rating::getRating, Collectors.counting()))); 
		Rating[] ratings = RatingFile.readFile(FILE_NAME);
		return Arrays.stream(ratings).collect(Collectors.groupingBy(Rating::getOutletCode, Collectors.groupingBy(Rating::getRating, Collectors.counting()))); */

		String countString="abcd";
		
		List<String> strList = Arrays.asList("a", "b", "c", "a", "d", "b", "a");
		Map<String, Integer> map = new HashMap<String, Integer>();
	Map<String, Long> count=strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println("count by Java 8"+count);
		

		Person p = new Person();

		strList.forEach(p::displayValue);

		// collect.stream().filter(s->s.intValue()).map(Map::entrySet)
		String s = "abacgn";
		s.chars().forEach(i -> {
			if (!map.containsKey(i)) {

			}
		});
		
		List<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		
		int []arr = {1,2,3,5};
	
		
		
		List<Integer> newList=	al.stream().map(i->i+1).collect(Collectors.toList());
		Arrays.stream(arr).map(i->i*2).forEach(System.out::println);
		System.out.println("new List"+newList);
		al.stream().forEach(i->{
			System.out.println("added +1 "+(i+1));
		});
		

	}
	

}
