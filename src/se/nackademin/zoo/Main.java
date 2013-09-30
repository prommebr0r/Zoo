package se.nackademin.zoo;

public class Main {
	public static void main(String[] args){
		
		BananFluga bananFluga = new BananFluga("Knurra", 2);
		BananFluga bananFluga1 = new BananFluga("Berit", 8);
		
		bananFluga.eat();
		bananFluga1.eat();
		bananFluga.play();
		bananFluga1.play();
		System.out.println(bananFluga.getTitle() + "n " + bananFluga.getName() + " är " + bananFluga.age() + " år gammal.");
		System.out.println(bananFluga1.getTitle() + "n " + bananFluga1.getName() + " är " + bananFluga1.age() + " år gammal.");

	}
}
