package se.nackademin.zoo;

public class Main {
	public static void main(String[] args){
		
		BananFluga bananFluga = new BananFluga("Knurra", 2);
		BananFluga bananFluga1 = new BananFluga("Berit", 8);
		
		bananFluga.eat();
		bananFluga1.eat();
		bananFluga.play();
		bananFluga1.play();
		System.out.println(bananFluga.getTitle() + "n " + bananFluga.getName() + " �r " + bananFluga.age() + " �r gammal.");
		System.out.println(bananFluga1.getTitle() + "n " + bananFluga1.getName() + " �r " + bananFluga1.age() + " �r gammal.");

	}
}
