package com.java.test;

import java.util.*;

public class EqualTest {

	private String name;
	private String id;

	public EqualTest() {

	}

	public EqualTest(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualTest other = (EqualTest) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		EqualTest e = new EqualTest();
		EqualTest e1 = new EqualTest("A", "1");
		EqualTest e2 = new EqualTest("A", "2");
		ArrayList<EqualTest> list = new ArrayList<>();
		list.add(e);

		list.add(e1);
		list.add(e2);

		EqualTest e3 = new EqualTest();
		// e3.setName("a");
		System.out.println("before " + list);
		if (list.contains(e3)) {

			e3 = list.get(list.indexOf(e3));
			e3.setId(e3.getId() + 2);
			e3.setName("Ak");

			list.set(list.indexOf(e3), e3);

		}

		System.out.println("after " + list);

	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", getName()=" + getName() + ", getId()=" + getId() + "";
	}

}
