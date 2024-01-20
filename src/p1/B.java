package p1;
public class B {
	static int x = 10;
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
		b1.test();
	}
	public void test() {
		System.out.println(this.x);
	}
}