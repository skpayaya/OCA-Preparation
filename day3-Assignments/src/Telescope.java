
public class Telescope {
	static int magnify=2;
	public static void main(String[] args) {
		go();

	}
	static void go() {
		int magnify=3;
		zoomIn();
		
	}
	static void zoomIn() {
		magnify*=5;
		zoomMore(magnify);
		System.out.println(magnify);
	}
	private static void zoomMore(int magnify2) {
		magnify2*=7;
		
	}

}
