package com.ash.pattern;

public class RightSidedTriangle {

	public static void main(String[] args) {
		
		int n =5;
		//Increasing Triangle
	/*	for(int r=1; r<=n; r++) {
			for(int c =r; c<=n; c++) {
				System.out.print("  ");
			}
			for(int c=1; c<=r; c++) {
				System.out.print("* ");
			}
			
			System.out.println(  );
			
			
		}
	}*/

	//Decreasing Triangle

		for(int r=1; r<=n; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print("  ");
			}
			
			for(int c =r; c<=n; c++) {
				System.out.print("* ");
			}
			System.out.println(  );
			
			



		}}




}
