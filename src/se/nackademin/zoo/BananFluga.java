package se.nackademin.zoo;

public class BananFluga implements Animal {

	private int legs, age;
	private String name, rawr, title;

	public BananFluga() {
		this.legs = 6;
		this.age = 1;
		this.name = "Berit Bananfluga";
		this.rawr = "Bzzzzzzzzzzzzzzzzzzzz";
		this.title = "Bananfluga";
	}
	
	public int legs() {
		return legs;
	}

	public String getTitle() {
		return title;
	}

	public String getRawr() {
		return rawr;
	}

	public int age() {
		return age;
	}

	public String getName() {
		return name;
	}
}
