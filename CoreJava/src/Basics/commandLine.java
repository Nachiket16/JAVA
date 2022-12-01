package Basics;

import java.io.Console;

public class commandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = Integer.parseInt(args[0]);
//		int num2 = Integer.parseInt(args[1]);
//		int num3 = Integer.parseInt(args[2]);
//		
//		int res = num1+num2+num3;
//		System.out.println(res);
		Console console = System.console();
		String name = console.readLine();
		System.out.println(name);
	}

}
