package se.nackademin.zoo;

public class Zebra implements Animal {
	private int legs, age;
	private String name, rawr, title, owner;

	public Zebra() {
		this.legs = 4;
		this.age = 42;
		this.name = "Zimbram";
		this.rawr = "Raawr";
<<<<<<< HEAD
		this.title = "Hast";
=======
		this.title = "Zebra";
		this.owner = "Olle Svensson";
>>>>>>> 0099478e3604f3f9d9c6844f43724024bee729bd
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
<<<<<<< HEAD
}
=======

	@Override
	public String getOwner() {
		return owner;
	}

}
>>>>>>> 0099478e3604f3f9d9c6844f43724024bee729bd
