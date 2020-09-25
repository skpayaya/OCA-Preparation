
public class Fizz {
int x=5;

	public static void main(String[] args) {
		final Fizz f1=new Fizz();
		Fizz f2=new Fizz();
		Fizz f3=FizzSwitch(f1,f2);
		System.out.println((f1==f3)+" "+(f1.x==f3.x));
		

	}

	 static Fizz FizzSwitch(Fizz x, Fizz y) {
		final Fizz z=x;
		z.x=6;
		return z;
	}

}

//true true
//The references f1 , z , and f3 all refer to the same instance of Fizz . The final
//modifier assures that a reference variable cannot be referred to a different object, but final
//doesn’t keep the object’s state from changing.