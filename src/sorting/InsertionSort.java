package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
	Integer[] alist = {4,1,2,5,3,9,8,6,10};
	System.out.println(Arrays.toString(InsertionSort.insertionSort(alist)));

	}
	public static Integer[] insertionSort(Integer[] alist){
		int passes = alist.length;
		for(int pass=1; pass < passes; pass++){
			int currentValue = alist[pass];
			int index = pass;
			while(index > 0 && alist[index-1]> currentValue){
				alist[index] = alist[index-1];
				System.out.println(Arrays.toString(alist));
				index = index - 1;
			}
			alist[index] = currentValue;
		}
		return alist;
	}
}
