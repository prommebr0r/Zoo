package se.nackademin.zoo;

public class Zebra implements Animal {
	private int legs, age;
	private String name, rawr, title, owner;

	public Zebra() {
		this.legs = 4;
		this.age = 42;
		this.name = "Zimbram";
		this.rawr = "Raawr";
		this.title = "Zebra";
		this.owner = "Olle Svensson";
	}

	@Override
	public int legs() {
		return legs;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getRawr() {
		return rawr;
	}

	@Override
	public int age() {
		return age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getOwner() {
		return owner;
	}

}
