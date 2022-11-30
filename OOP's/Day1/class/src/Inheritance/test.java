package Inheritance;

class A{
	public void show() {
		System.out.println("This is A class SHOW method");
	}
}
interface B{
	public void display();
}

class C extends A implements B{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Class C: implemented Display From Interface B");
	}
	
	@Override
	public void show() {
		System.out.println("This is C class SHOW method");
	}
	
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C objC = new C();
		objC.show();
		
		A objA = new C();
		objA.show();
		
		B objB = new C();
		objB.display();
		
		A objA2 = new A();
		objA2.show();
		
		
	}

}
