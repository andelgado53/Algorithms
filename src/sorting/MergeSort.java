package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		Integer[] alist = {9,2,4,6};
		System.out.println(Arrays.asList(mergeSort(alist)));

	}
	
	public static Integer[] mergeSort(Integer[] alist){
		if(alist.length > 1){
			int med = alist.length /2;
			Integer[] left = Arrays.copyOfRange(alist, 0, med);
			Integer[] right = Arrays.copyOfRange(alist, med, alist.length);
			mergeSort(left);
			mergeSort(right);
			
			int i = 0; 
			int j = 0;
			int k = 0;
			while(i < left.length && j < right.length){
				if(left[i] < right[j]){
					alist[k] = left[i];
					k++;
					i++;
				}
				else{
					alist[k] = right[j];
					k++;
					j++;
				}
			}
			while(i < left.length){
				alist[k] = left[i];
				k++;
				i++;
			}
			while(j < right.length){
				alist[k] = right[j];
				k++;
				j++;
			}
			
		}
		return alist;
	}

}
