
public class Electronic implements Device{


	public void doIt() {
		
	}

}
abstract class Phone1 extends Electronic {
	
}
abstract class Phone2 extends Electronic {
	
}
class Phone3 extends Electronic implements Device {
	public void doStuff() {}
}
interface Device {
	public void doIt();
}
//A is correct