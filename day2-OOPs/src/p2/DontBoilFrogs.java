package p2;
interface FrogBoilable
{
	static int getctoF(int cTemp) 
	{
		return (cTemp *9/5)+32;
	}
	default String hop() {
		return "hopping";
	}
}
	public class DontBoilFrogs implements FrogBoilable{
	public static void main(String[] args) {
		new DontBoilFrogs().go();
	}
	void go() {
		System.out.println(hop());//legal invocation of an interface’s default method.
//		System.out.println(getCtoF(100));//cannot find symbol
		
		System.out.println(FrogBoilable.getctoF(100));//THE legal way to invoke an interface’s static method.
		DontBoilFrogs dbf = new DontBoilFrogs();
//		System.out.println(dbf.getCtoF);//cannot find symbol
	}
	}
	