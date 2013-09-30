package se.nackademin.zoo;

public class Lejon implements Animal{

	@Override
	public int legs() {
		return 4;
	}

	@Override
	public String getTitle() {
		return "Lejon";
	}

	@Override
	public String getRawr() {
		return "RAAAAAAAAAAR";
	}

	@Override
	public int age() {
		return 6;
	}

	@Override
	public String getName() {
		return "Simba";
	}

}
