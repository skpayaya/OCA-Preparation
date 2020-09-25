
public class q3 {
public static void main(String[] args) {
	int i1=1_000;//A
	int i2=10_00;//B
	int i3=_10_000;//C   won't compile
	int i4=0b101010;//D
	int i5=0B10_1010;//E
	int i6=0x2_a;//F
	
}
}

//
//As of Java 7, underscores can be included in
//numeric literals, but not at the beginning or the end.
// A and B are legal numeric literals. D and E are examples of
//valid binary literals, which were new to Java 7, and F is a valid hexadecimal literal that uses an
//underscore. (OCA Objective 2.1)