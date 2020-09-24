class Animal{
	public void eat() throws Exception{

	}
}
public class Dog2 extends Animal {
	@Override
	public void eat() {

	}
	public static void main(String[] args) {
		Animal a=new Dog2();
		Dog2 d= new Dog2();
		d.eat();
		a.eat();
	}
}
//line 14 - compiler error
//This code will not compile because of the exception declared on the Animal
//eat()
//method.This happens even though, at runtime, the eat() method used would be the Dog version, which
//does not declare the exception.1