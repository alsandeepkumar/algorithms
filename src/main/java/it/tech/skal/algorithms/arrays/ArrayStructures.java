package it.tech.skal.algorithms.arrays;

public class ArrayStructures {

	private int[] myArray = new int[50];
	private int myArraySize = 10;

	public static void main(String[] args) {
		ArrayStructures arrayStructures = new ArrayStructures();
		arrayStructures.populateMyArray();
//		arrayStructures.printHorizontalArray();

		// arrayStructures.deleteElementByIndex(5);
		// arrayStructures.printMyArray();
		// arrayStructures.insertElement(19);
		// arrayStructures.printMyArray();

		// arrayStructures.doLinearSearch(11);
//		arrayStructures.bubbleSort();
//		arrayStructures.binarySearchForValue(18);
//		arrayStructures.selectionSort();
		arrayStructures.insertionSort();
	}

	private void insertionSort() {
		int counter = 0;
		System.out.println("---------------INSERTION SORT STARTED -------------------");
		for (int i = 1; i < myArraySize; i++) {
			System.out.println("---------------round "+(++counter)+" -------------------");
			int j=i;
			int toInsert = myArray[i];
			while ((j>0)&&(myArray[j-1]>toInsert)) {
				myArray[j]=myArray[j-1];
				j--;
			}
			myArray[j] = toInsert;
			printHorizontalArray();
		}		
		System.out.println("---------------INSERTION SORT COMPLETED -------------------");
	}

	private void selectionSort() {
		int counter = 0;
		System.out.println("---------------SELECTION SORT STARTED -------------------");
		for (int i = 0; i < myArraySize; i++) {
			System.out.println("---------------round "+(++counter)+" -------------------");
			int minimum = i;
			for (int j = i; j < myArraySize; j++) {
				if(myArray[minimum]>myArray[j]){
					minimum = j;					
				}
			}
			swapValues(i,minimum);
			printHorizontalArray();
		}
		System.out.println("---------------SELECTION SORT COMPLETED -------------------");
	}

	private void binarySearchForValue(int i) {
		int lowIndex = 0;
		int highIndex = myArraySize - 1;

		while (lowIndex <= highIndex) {
			int middleIndex = ((lowIndex + highIndex) / 2);
			if (i > myArray[middleIndex]) {
				printIndex(lowIndex, middleIndex, highIndex);
				lowIndex = middleIndex + 1;
			} else if (i < myArray[middleIndex]) {
				printIndex(lowIndex, middleIndex, highIndex);
				highIndex = middleIndex - 1;
			} else {
				printIndex(lowIndex, middleIndex, highIndex);
				lowIndex = highIndex + 1;
				if (i == myArray[middleIndex]) {
					System.out.println("Match found for value:" + i
							+ "at index " + middleIndex);
				} else {
					System.out.println("garbage");
				}
			}
		}

	}

	private void printIndex(int lowIndex, int middleIndex, int highIndex) {
		System.out.println("L:" + lowIndex + " M:" + middleIndex + " H:"
				+ highIndex);

	}

	private void bubbleSort() {
		int counter =0;
		System.out.println("---------------BUBBLE SORT STARTED -------------------");
		for (int i = myArraySize - 1; i > 1; i--) {
			System.out.println("---------------round "+(++counter)+" -------------------");
			for (int j = 0; j < i; j++) {
				if (myArray[j] < myArray[j + 1]) {
					swapValues(i,j);

				}
			}
			System.out.println("----------");
			printHorizontalArray();
			System.out.println("----------");		
		}
		System.out.println("---------------BUBBLE SORT COMPLETED -------------------");
	}

	private void printHorizontalArray() {
		System.out.println();
		for (int j2 = 0; j2 < myArraySize; j2++) {
			System.out.print("| " + j2 + " |");
		}
		System.out.println();
		for (int j2 = 0; j2 < myArraySize; j2++) {
			System.out.print("|" + myArray[j2] + " |");
		}
		System.out.println();

	}

	private void swapValues(int i,int j) {
		int tempVar = myArray[i];
		myArray[i] = myArray[j];
		myArray[j] = tempVar;

	}

	private void populateMyArray() {
		for (int i = 0; i < myArraySize; i++) {
			myArray[i] = (int) ((Math.random() * 10) + 10);
		}
	}

	private void printMyArray() {
		System.out.println("----------");
		for (int i = 0; i < myArraySize; i++) {
			System.out.print("| " + i + " |");
			System.out.println(myArray[i] + " |");
		}
		System.out.println("----------");

	}

	private void insertElement(int value) {
		if (myArraySize < 50) {
			myArraySize++;
			myArray[myArraySize - 1] = value;
		}
	}

	private void deleteElementByIndex(int index) {
		if (index > myArraySize) {
			System.out
					.println("Please provide the index within array size range");
			return;
		}

		for (int i = index; i < myArraySize; i++) {
			myArray[i] = myArray[i + 1];
		}
		myArraySize--;
	}

	private void doLinearSearch(int searchParameter) {
		String indexString = "";
		boolean isSearchValuePresent = false;
		for (int i = 0; i < myArraySize; i++) {
			if (searchParameter == myArray[i]) {
				indexString += i + " ";
				isSearchValuePresent = true;
			}
		}

		if (!isSearchValuePresent) {
			System.out.println("The linear search output:Not found");
		} else {
			System.out
					.println("The linear search output:Search string found in:"
							+ indexString);
		}
	}

}
