package p1;
class Animal{
	void makeNoise() {
		System.out.println("generic noise");
	}
}
class Dog extends Animal{
	void makeNoise() {
		System.out.println("bark");
		
	}
	void playDead() {
		System.out.println("roll over");
	}
}

public class CastTest2 {
public static void main(String[] args) {
//	Animal [] a= {new Animal(),new Dog(),new Animal()};
//	for (Animal animal : a) {
//		animal.makeNoise();
//		if(animal instanceof Dog)
//			 animal.playDead();//cannot find symbolThe compiler is saying, “Hey, class Animal doesn’t have a playDead() method.”
//	}
	Animal [] a= {new Animal(),new Dog(),new Animal()};
	for (Animal animal : a) {
		animal.makeNoise();
		if(animal instanceof Dog)
			 ((Dog) animal).playDead();//compiles but fails later ClassCastException
	}
}
}
