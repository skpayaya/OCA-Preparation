class Clidder{
	private final void flipper() {
		System.out.println("CLidder");
	}
}
public class Clidlet extends Clidder {
public final void flipper() {
	System.out.println("Clidlet");
}
public static void main(String[] args) {
	new Clidlet().flipper();
}
}
//Although a final method cannot be overridden, in this case, the method
//is private and, therefore, hidden. The effect is that a new, accessible, method flipper is
//created. Therefore, no polymorphism occurs in this example, the method invoked is simply
//that of the child class, and no error occurs.