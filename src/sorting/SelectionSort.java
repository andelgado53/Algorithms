package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Sort an unsorted arrays: ");
		Integer[] alist = {10,9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(SelectionSort.selectionSort(alist)));
		
		System.out.println("Sort a sorted arrays: ");
		Integer[] alist1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(SelectionSort.selectionSort(alist1)));

	}
	public static Integer[] selectionSort(Integer[] alist){
		int passNum = alist.length - 1;
		for(int pass= passNum; pass >=1; pass--){
			int max = 0;
			for(int index=1; index<=pass; index++){
				if(alist[index] > alist[index-1]) max = index;
			}
			int temp = alist[pass];
			alist[pass] = alist[max];
			alist[max] = temp;
		}
		return alist;
	}

}
