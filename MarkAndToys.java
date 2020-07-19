package HackerRankSorting;

import java.util.Arrays;

public class MarkAndToys {

	public static void main(String[] args) {
		int[] arr = {1, 12, 5, 111, 200, 1000, 10};
		System.out.println(myMarkAndToys(arr, 50));
	} //main
//============================================
	public static int myMarkAndToys(int[] prices, int k) {
		int toys = 0;
		if(prices.length == 0 || k == 0) return toys;
		
		Arrays.sort(prices);
		for(int i=0; i<prices.length; i++) {
			k -= prices[i];
			if(k < 0) return toys;
			toys++;
		}		
		return toys;		
	} // myMarkAndToys

} // class
