
public class Test {
public static void main(String[] args) {
	Test t1=new Test();
	Test t2 =new Test();
	System.out.println(t1.equals(t2));
	System.out.println(t1 instanceof Test);
	System.out.println(t1 instanceof Object);
}
}

//false
//true
//true
//The reference variable t1 is of type Test , and there’s no
//equals method in the Test class. The third test asks whether t1 is an instance of class
//Object , and because it is, the test succeeds.