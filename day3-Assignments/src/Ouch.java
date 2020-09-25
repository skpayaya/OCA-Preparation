
public class Ouch {
	static int ouch=7;
	public static void main(String[] args) {
		new Ouch().go(ouch);
		System.out.println(" "+ouch);
	}
	void go(int ouch) {
		ouch++;
		for(int ouch=3;ouch<6;ouch++) {//Compilation Fails annot be declared again in the same scope as the declaration .
			
		}
		System.out.println(" "+ouch);
	}
}
