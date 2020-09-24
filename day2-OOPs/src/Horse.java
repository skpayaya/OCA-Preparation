class Animal2{
	public void eat(){
		System.out.println("generic Animal Eating Generically");
	}
}
public class Horse extends Animal2 {
	public void eat() {
		System.out.println("Horse eating hay");
	}
	public void eat(String s) {
		System.out.println("Horse eating"+s);
	}
	public static void main(String[] args) {
		Animal2 a=new Horse();

		a.eat();//generic eating animal genercally
		Horse d= new Horse();
		d.eat(); //horse eating hay
		Animal2 d1= new Horse();
		d1.eat(); //horse eating hay
		
		Horse d2= new Horse();
		d2.eat("apple"); //horse eating apple
		
		Animal2 d3= new Animal2();
		d3.eat("apple"); //Compiler error -Compiler sees that animal doesn't have eat() method
		
		Animal2 d4= new Horse();
		d4.eat("apple"); //Compiler error- Compiler looks only at the reference and sees that animal doesn't have eat() method.Compiler doesn't care about actual object used in runtime
		
		
		
	}
}