package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] alist = {3,1,2,6,7,4,9,8,10,5};
		System.out.println("Sort unsorted array: ");
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(alist)));
		System.out.println("Sort sorted array: ");
		Integer[] alist1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(alist1)));
		Integer[] alist2 = {10,9,8,7,6,5,4,3,2,1,0};
		System.out.println("Sort unsorted array: ");
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(alist2)));
		
	}
	
	public static Integer[] bubbleSort(Integer[] alist){
		
		int numOfPass = alist.length - 1;
		for(int pass = numOfPass; pass >= 1; pass-- ){
			for(int item=1; item <= pass; item++){
				if(alist[item] < alist[item-1]){
					int temp = alist[item];
					alist[item] = alist[item-1];;
					alist[item-1] = temp;
					
				}
			}
		}
		
		return alist;
	}

}
