package Basics;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey gandu how many star you need in box shape?");
		int v=sc.nextInt();
		int h=sc.nextInt();
		
		for(int i=0; i<v; i++) {
			for(int j=0; j<h; j++) {
				if(i==0 || i==v-1) {
					System.out.print("*");
				}else if(j==0 || j==h-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		int n =5;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(i==j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}


	}

}
