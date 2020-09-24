interface MyInterface {
	default int doStuff() {
	return 42;	
	}
}
public class IfaceTest implements MyInterface
{
public static void main(String[] args) {
new IfaceTest().go();
}
void go() {
	//INSERT HERE
	System.out.println("class: " + doStuff());
	System.out.println("iface: " + MyInterface.super.doStuff());
}
public int doStuff() {
	return 43;
}
}
//Which line(s) of code, inserted independently at // INSERT CODE HERE, will allow the
//code to compile? (Choose all that apply.)
//A. System.out.println(“class: ” + doStuff());
//B. System.out.println(“iface: ” + super.doStuff());
//C. System.out.println(“iface: ” + MyInterface.super.doStuff());
//D. System.out.println(“iface: ” + MyInterface.doStuff());
//E. System.out.println(“iface: ” + super.MyInterface.doStuff());
//F. None of the lines, A–E will allow the code to compile

//A and C are correct. A uses correct syntax to invoke the class’s method, and C uses
//the correct syntax to invoke the interface’s overloaded default method.
//B, D, E, and F are incorrect.