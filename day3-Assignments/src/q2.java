
public class q2 {

	byte b1=4;
	int i1=123456;
	long L1=(long)i1;
	short s2=(short)i1;
	byte b2=(byte)i1;
	int i2=(int)123.456;
	byte b3=b1+7;//won't compile 
}
//When a mathematical operation is performed on
//any primitives smaller than int s, the result is automatically cast to an integer.