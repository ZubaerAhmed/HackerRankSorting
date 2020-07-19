package HackerRankSorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortMinimumSwap {

	public static void main(String[] args) {
		int[] array = {3, 2, 1, 5, 7};
		myBubleSorting(array);
		System.out.println("\n--------------------");
		Integer[] array2 = {3, 2, 1, 5, 7,4, 9};
		swap(array2);
		System.out.println("\n--------------------");
		Integer[] arr = { 1, 2, 3, 4, 5, 7, 8 };
		swap(arr); 
		swap(randomArray()); //not working
	}
//==================================================================
	public static void myBubleSorting(int[] a) {
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");
		int n = a.length;
		int count = 0;
		for (int i=0; i<n; i++) {			    
			for (int j=0; j<n-1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;			
					count++;
				}
			}  
		} 
		System.out.println("Sorted in "+count+" swaps."); 
		//-------------------
		for(int i : a) {
			System.out.print(i+ " ");
		}
	}// main method
//------------------------------------------------------
	public static <T> void swap(T[] array) {
		System.out.println(Arrays.asList(array));
		int count = 0;

			for (int i=0; i<array.length/2; i++){ //devided by 2
				T temp = array[i]; 
				array[i] = array[array.length-1 - i]; 
				array[array.length-1 - i] = temp;  
				count++;
			} 

		System.out.println(Arrays.asList(array));
		for(T i : array) {
			System.out.print(i+ " ");
		}
		System.out.println("\nCount: "+count); 
	} //myBubleSorting2	
//---------------------------------------------------------------
	public static Integer[] randomArray() {
		Random rand = new Random();
		int size = 6;
		Integer[] arr = new Integer[size];
		for(int i=0; i<size; i++) {
			arr[i] = rand.nextInt(49);
		}
		return arr;
	}
}// BubbleSort class
