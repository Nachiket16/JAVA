
public class Main {

	public static void main(String[] args) {
		Student [] obj = new Student[5];
		
		obj[0] = new Student(01, "99.oof", 99.00f);
		System.out.println(obj[0].name);
		
		Student Nachiket;
		Nachiket = new Student();
		Nachiket.rollNo = 01;
		Nachiket.marks=99.00f;
		Nachiket.name="Nachiket";
		System.out.println(Nachiket);
		System.out.println(Nachiket.rollNo);
		System.out.println(Nachiket.name);
		System.out.println(Nachiket.marks);

	}

}


 class Student{
	 
	 int rollNo;
	 String name;
	 Float marks;
	 
	 public Student() {
		 
	 }
	 
	 public Student(int i, String string, float f) {
		rollNo = i;
		name = string;
		marks = f;
	}
	
 }