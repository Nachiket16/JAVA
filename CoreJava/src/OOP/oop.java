package OOP;

public class oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		additionImpl add = new additionImpl();
		System.out.println(add.sum(55, 55));
		
		System.out.println(add.sum("nachiket ", "khule."));
		
		substractionImpl sub = new substractionImpl();
		
		System.out.println(sub.sub(10, 5, 2));
		
	}

}
