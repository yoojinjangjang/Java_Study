package ch05;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] Array1 = new int[10];
		int[] Array2 = new int[10];
		int[] Array3 = new int[] {100,95,80,70,60};
		char[] chArray = {'a','b','c','d'};
		
		for ( int i = 0;i<Array1.length;i++) {
			Array1[i] = i+1;
		}
		
		for ( int i = 0;i<Array2.length;i++) {
			Array2[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i = 0;i<Array1.length;i++) {
			System.out.print(Array1[i]+",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(Array2));
		System.out.println(Arrays.toString(Array3));
		System.out.println(Arrays.toString(chArray));
		
		System.out.println(Array3);
		System.out.println(chArray);
	}

}
