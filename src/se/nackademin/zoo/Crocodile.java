package se.nackademin.zoo;

public class Crocodile implements Animal {

	public int legs() {

		return 4;
	}

	public String getTitle() {

		String s = ""
				+"\r            .-._   _ _ _ _ _ _ _ _"
				+"\r .-''-.__.-'00  '-' ' ' ' ' ' ' ' '-."
				+"\r'.___ '    .   .--_'-' '-' '-' _'-' '._"
				+"\r V: V 'vv-'   '_   '.       .'  _..' '.'."
				+"\r   '=.____.=_.--'   :_.__.__:_   '.   : :"
				+"\r           (((____.-'        '-.  /   : :"
				+"\r                             (((-'  .'   "
				+"\r                           _____..'  .'"
				+"\r                          '-._____.-'";				
   		return "I'm Reptile and look like this: "+s;

	}

	public String getRawr() {

		return "argh!";
	}

	public int age() {

		return 47;
	}

	public String getName() {

		return "Crok";
	}

	public String getOwner() {
		return "Sebastian";
	}

}
