package se.nackademin.zoo;

public class Crocodile implements Animal {

	private int legs, age;
	private String name, rawr, title;

	public Crocodile() {
		this.legs = 4;
		this.age = 47;
		this.name = "Crok";
		this.rawr = "argh!";
		this.title = "I'm Reptile";
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
