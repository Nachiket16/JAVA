package Basics;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "nachiket";
		Integer age = 25;
		char gender ='M';
		boolean res1 = name instanceof String;	//Operator
		boolean res = age instanceof Integer;	//Only work for an Objects
//		boolean res2 = gender instanceof char;	//Only work for an Objects
		
		//instanceof does not allow for premetive data types
		System.out.println(name instanceof String);
		System.out.println(res);
		
		
	}	

}
