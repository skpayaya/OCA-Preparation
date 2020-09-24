enum Animals{
	DOG("woof"),CAT("MEOW"),FISH("burble");
	String sound;
	Animals(String s) { sound=s;}
}
public class q3 {
	static Animals a;
	public static void main(String[] args) {
	System.out.println(a.DOG.sound + " " +a.FISH.sound);
}
}
//enum's can have constructors and variables.