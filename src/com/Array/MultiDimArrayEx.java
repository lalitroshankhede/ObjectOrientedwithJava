package com.Array;

public class MultiDimArrayEx {

	public static void main(String[] args) {

		int[][] array= {{1,2,3},{4,5,6},{7,8,9}};

		for (int[] element : array) {

			for (int j = 0; j < array.length; j++) {

	               System.out.print(element[j]+"\t");


			}
			System.out.println(" ");

		}


	}
}
