package se.nackademin.zoo;
import se.nackademin.zoo.Presentation;
public class Main {
	public static void main(String[] args){
		Panda panda = new Panda();
		Imp imp = new Imp();
		Lejon lejon = new Lejon();
		BananFluga bananfluga = new BananFluga();
		Crocodile croc = new Crocodile();
		Zebra zebra = new Zebra(4, 12, "Zebran zyber");
		
		Presentation press = new Presentation();
		press.presentation(panda.getTitle(), panda.age(), panda.getRawr(), panda.getName(), panda.legs());
		press.presentation(imp.getTitle(), imp.age(), imp.getRawr(), imp.getName(), imp.legs());
		press.presentation(lejon.getTitle(), lejon.age(), lejon.getRawr(), lejon.getName(), lejon.legs());
		press.presentation(bananfluga.getTitle(), bananfluga.age(), bananfluga.getRawr(), bananfluga.getName(), bananfluga.legs());
		press.presentation(zebra.getTitle(), zebra.age(), zebra.getRawr(), zebra.getName(), zebra.legs());
		press.presentation(croc.getTitle(), croc.age(), croc.getRawr(), croc.getName(), croc.legs());
	}
}
