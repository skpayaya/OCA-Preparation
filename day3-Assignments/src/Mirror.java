
public class Mirror {
	int size=7;
	public static void main(String[] args) {
		Mirror m1=new Mirror();
		Mirror m2=m1;
		int i1=10;
		int i2=i1;
		go(m2,i2);
		System.out.println(m1.size+" "+i1);
	}
	static void go(Mirror m,int i) {
		m.size=8;
		i=12;
	}
}
//8 10

//In the go() method, m refers to the single Mirror instance, but the int
//new int variable, a detached copy of i2 .