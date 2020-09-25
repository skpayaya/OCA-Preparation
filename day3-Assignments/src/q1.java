class CardBoard{
	Short story=200;//eligible
	CardBoard go(CardBoard cb) {
		cb=null;
		return cb;
	}
}
public class q1 {

	public static void main(String[] args) {
		CardBoard c1=new CardBoard();//eligible
		CardBoard c2=new CardBoard();//this is not eligible
		CardBoard c3=c1.go(c2);
		c1=null;
		
		//do Stuff

	}

}

//When do Stuff is reached, how many objects are eligible for garbage collection?

//Only one CardBoard object (c1) is eligible, but it has an associated Short
//wrapper object that is also eligible.