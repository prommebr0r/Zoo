package se.nackademin.zoo;

public class Imp implements Animal {

	private int legs, age;
	private String name, rawr, title;

	public Imp() {
		this.legs = 2;
		this.age = 37;
		this.name = "Bob";
		this.rawr = "Meh";
		this.title = "Imp";
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
