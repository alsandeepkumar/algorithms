package it.tech.skal.algorithms.sorting.quicksort;

public class QuickSort{
	
	private int[] myarray;
	private int length;
	
	
	public static void main(String ar[]){
		QuickSort quickSort = new QuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		for(int i : input){
			System.out.print(i);
			System.out.print(" ");
		}
		quickSort.sort(input);
		System.out.println();
		for(int i : input){
			System.out.print(i);
			System.out.print(" ");
		}
		
	}


	private void sort(int[] input) {
		if(input==null || input.length==0){
			return;
		} 
		this.myarray = input;
		length = input.length;
		quicksort(0,length-1);
		
	}


	private void quicksort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		
		// find pivot;
		int pivot = myarray[lowerIndex+(higherIndex-lowerIndex)/2];
		while (i <= j) {
			while (myarray[i] < pivot) {
				i++;
			}

			while (myarray[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = myarray[i];
				myarray[i] = myarray[j];
				myarray[j] = temp;
				i++;
				j--;
			}
		}
		if(lowerIndex < j) {
			quicksort(lowerIndex, j);
		}
		
		if(i< higherIndex){
			quicksort(i, higherIndex);
		}
		
	}
}