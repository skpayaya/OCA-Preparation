interface Gadget{
	void doStuff();
}
abstract class Electronic1 {
	void getPower() {
		System.out.println("plug in ");
	}
}
public class Tablet extends Electronic1 implements Gadget {

	void doStuff() {  //won't compile
		System.out.println("show book ");
	}
	public static void main(String[] args) {
		new Tablet().getPower();
		new Tablet().doStuff();

	}

}


//By default, an interface’s methods are public so the Tablet.doStuff
//method must be public, too. The rest of the code is valid.