package se.nackademin.zoo;

public class Panda implements Animal {

	private int legs, age;
	private String name, rawr, title;

	public Panda() {
		this.legs = 4;
		this.age = 8;
		this.name = "Pandemonium";
		this.rawr = "ROOOOAR!";
		this.title = "Panda";
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

	public String getOwner() {
		return "Olof";
	}
}