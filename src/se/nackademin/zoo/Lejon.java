package se.nackademin.zoo;

public class Lejon implements Animal{
	private int legs, age;
	private String name, rawr, title;

	public Lejon() {
		this.legs = 4;
		this.age = 6;
		this.name = "Simba";
		this.rawr = "RAAAAAAAAAAR";
		this.title = "Lejon";
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