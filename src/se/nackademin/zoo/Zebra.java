package se.nackademin.zoo;

public class Zebra implements Animal {
	private int legs, age;
	private String name;

	public Zebra(int legs, int age, String name) {
		this.legs = legs;
		this.age = age;
		this.name = name;
	}

	@Override
	public int legs() {
		return 0;
	}

	@Override
	public String getTitle() {
		return null;
	}

	@Override
	public String getRawr() {
		return null;
	}

	@Override
	public int age() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

}
