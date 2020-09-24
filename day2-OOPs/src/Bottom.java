
public class Bottom  extends Top{
public Bottom(String s) {
	System.out.println("D");
}
public static void main(String[] args) {
	new Bottom("C");
	System.out.println(" ");
}
}
class Top {
	public Top(String s) {
		System.out.println("B");
	}
}

//The implied super() call in Bottom2 ’s constructor cannot be satisfied
//because there is no no-arg constructor in Top