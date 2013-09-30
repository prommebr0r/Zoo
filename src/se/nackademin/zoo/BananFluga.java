package se.nackademin.zoo;

public class BananFluga implements Animal {
	
	private String name;
	private int legs;
	private String title;
	private String rawr;
	private int age;
	
	public BananFluga(String name, int age)
	{
		this.name = name;
		this.legs = legs();
		this.title = getTitle();
		this.rawr = getRawr();
		this.age = age;
	}
	
	public void eat()
	{
		System.out.println(this.getTitle() + "n goes omnomnomnom...");
	}
	
	public void play()
	{
		System.out.println(this.getTitle() + "n goes bzzzzz.");
	}

	@Override
	public int legs() {
		return 6;
	}

	@Override
	public String getTitle() {
		return "Bananfluga";
	}

	@Override
	public String getRawr() {
		return "Bzzzzzzzzzzzzzzzzzzzz";
	}

	@Override
	public int age() {
		return this.age;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
