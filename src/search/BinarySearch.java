package search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		Integer[] alist = {1,2,3,4,5,6,7,8,9,10};
		for(int i=1; i<alist.length; i= i+1){
			System.out.println(binarySearchNonRecursive(alist, i));
		}
		
		Integer[] alist1 = {1,2,3,4,5,6,7,8,9,10};
		for(int i=1; i<alist1.length; i= i+1){
			System.out.println(binarySerachRecursive(alist1, i));
		}
		System.out.println(binarySerachRecursive(alist1, -1));
	}
	
	public static boolean binarySearchNonRecursive(Integer[] alist, Integer numToFind){
		int start = 0;
		int end = alist.length ;
		int middle = end/2;
		//System.out.println(middle);
		boolean found = false;
		while(!found && end > start){
			if(alist[middle].equals(numToFind)) {
				found = true;
			}
			else if(numToFind > alist[middle]){
				start = middle + 1;
				middle = (start + end)/2;
			}
			else{
				end =  middle ;
				middle = end/2;
			}
		}
		
		return found;
		
	}
	
	public static boolean binarySerachRecursive(Integer[] alist, Integer numToFind){
		int middle = alist.length / 2;
		if(alist.length == 0) return false;
		else if(alist[middle].equals(numToFind)) return true;
		else if(alist[middle] > numToFind) return binarySerachRecursive(Arrays.copyOfRange(alist, 0, middle), numToFind);
		else return binarySerachRecursive(Arrays.copyOfRange(alist, middle +1 , alist.length), numToFind);
	}

}
