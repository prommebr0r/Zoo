package se.nackademin.zoo;

public class BananFluga implements Animal {
	
	private String owner = "Carl Ryttarson";
	
//lol
	@Override
	public int legs() {
		return 6;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Bananfluga";
	}

	@Override
	public String getRawr() {
		// TODO Auto-generated method stub
		return "Bzzzzzzzzzzzzzzzzzzzz";
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Berit Bananfluga";
	}

	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return this.owner;
	}

}
