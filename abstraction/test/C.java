package java_topics.abstraction.test;

public class C extends B{
	@Override
	public void method1() {
		System.out.println("This is method1 of class B");
	}

	@Override
	public void method2() {
	System.out.println("This is method2 of class B");
		
	}
	public static void main(String[] args) {
		C c =new C();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
	}

}
