
public class Wind {
	int id;
	public Wind(int i) {
		id=i;
		}
	public static void main(String[] args) {
		new Wind(3).go();
		//commented line
	}
	private void go() {
		Wind w1=new Wind(1);
		Wind w2=new Wind(2);
		System.out.println(w1.id+" "+w2.id);

	}
}

//When execution reaches the commented line, which are true? (Choose all that apply.)
//A. The output contains 1
//B. The output contains 2
//C. The output contains 3
//D. Zero Wind objects are eligible for garbage collection
//E. One Wind object is eligible for garbage collection
//F. Two Wind objects are eligible for garbage collection
//G. Three Wind objects are eligible for garbage collection

//A,B,G are correct
//The constructor sets the value of id for w1 and w2 . When the
//commented line is reached, none of the three Wind objects can be accessed, so they are eligible to
//be garbage collected.