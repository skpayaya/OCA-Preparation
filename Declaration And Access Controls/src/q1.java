
public class q1 {

	public static void main(String[] args) {
		new q1().go();
	}

	 void go() {
		blastOff();
		//Rocker.blastOff();  //line A
		
	}

	private void blastOff() {
		System.out.println("sh-bang ");		
	}

}
class Rocket{
	private void blastOff() {
		System.out.println("bang ");
	}
}

//Output is sh-bang
//if line A is uncommented.compilation fails
//Since Rocket.blastOff() is private , it can’t be overridden, and it is invisible to class Shuttle .