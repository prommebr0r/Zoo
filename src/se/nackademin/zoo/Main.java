package se.nackademin.zoo;
import se.nackademin.zoo.Presentation;
public class Main {
	public static void main(String[] args){
		Panda panda = new Panda();
		Imp imp = new Imp();
		Lejon lejon = new Lejon();
		BananFluga bananfluga = new BananFluga();
		Crocodile croc = new Crocodile();
		Zebra zebra = new Zebra();
		
		Presentation press = new Presentation();
		//lol
		press.presentation(panda.getTitle(), panda.age(), panda.getRawr(), panda.getName(), panda.legs(), panda.getOwner());
		press.presentation(imp.getTitle(), imp.age(), imp.getRawr(), imp.getName(), imp.legs(), imp.getOwner());
		press.presentation(lejon.getTitle(), lejon.age(), lejon.getRawr(), lejon.getName(), lejon.legs(), lejon.getOwner());
		press.presentation(bananfluga.getTitle(), bananfluga.age(), bananfluga.getRawr(), bananfluga.getName(), bananfluga.legs(), bananfluga.getOwner());
		press.presentation(zebra.getTitle(), zebra.age(), zebra.getRawr(), zebra.getName(), zebra.legs(), zebra.getOwner());
		press.presentation(croc.getTitle(), croc.age(), croc.getRawr(), croc.getName(), croc.legs(), croc.getOwner());
	}
}
