
public class Mixer {
public Mixer() {
}
Mixer(Mixer m){
	m1=m;
}
Mixer m1;
public static void main(String[] args) {
	Mixer m2=new  Mixer();
	Mixer m3=new Mixer(m2); m3.go();//hi
	Mixer m4=m3.m1; m4.go();//hi
	Mixer m5=m2.m1; m5.go();//NullPointerexception m5 is null
	
}
void go(){
	System.out.println("hi ");
}
}
