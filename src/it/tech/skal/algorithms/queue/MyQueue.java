package it.tech.skal.algorithms.queue;

import java.util.Arrays;

public class MyQueue {

	private String[] queueArray;

	private int queueSize;

	private int front = 0, rear = 0;
	private int numberOfElements;

	public MyQueue(int argQueuesize) {
		this.queueSize = argQueuesize;
		queueArray = new String[argQueuesize];
		Arrays.fill(queueArray, "-1");
	}

	public void insert(String element) {
		if (++numberOfElements <= queueSize) {
			queueArray[rear] = element;
			rear++;
		} else {
			System.out.println("Exceeds queue size");
		}
	}

	public String delete() {
		String removedElement = "";
		if (numberOfElements > 0) {
			removedElement = queueArray[front];
			queueArray[front] = "-1";
			front++;
			numberOfElements--;
		}

		return removedElement;
	}

	public void displayTheQueue() {

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < queueSize; n++) {

			System.out.format("| %2s " + " ", n);

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < queueSize; n++) {

			if (queueArray[n].equals("-1"))
				System.out.print("|     ");

			else
				System.out.print(String.format("| %2s " + " ", queueArray[n]));

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		// Number of spaces to put before the F

		int spacesBeforeFront = 3 * (2 * (front + 1) - 1);

		for (int k = 1; k < spacesBeforeFront; k++)
			System.out.print(" ");

		System.out.print("F");

		// Number of spaces to put before the R

		int spacesBeforeRear = (2 * (3 * rear) - 1) - (spacesBeforeFront);

		for (int l = 0; l < spacesBeforeRear; l++)
			System.out.print(" ");

		System.out.print("R");

		System.out.println("\n");

	}
	
	public void priorityInsert(String element) {
		int i =0;
		if (numberOfElements == 0) {
			insert(element);
		} else if (numberOfElements + 1 <= queueSize) {
			for (i = numberOfElements - 1; i >= 0; i--) {
				if (Integer.parseInt(element) > Integer.parseInt(queueArray[i])) {
					queueArray[i + 1] = queueArray[i];

				} else break;
			}
			queueArray[i+1] = element;
			numberOfElements++;
			rear++;
		} else {
			System.out.println("Queue size exceeded");
		}
	
	}

	public static void main(String arg[]) {
		MyQueue queue = new MyQueue(10);
		queue.priorityInsert("10");
		queue.priorityInsert("09");
		queue.priorityInsert("13");
		queue.displayTheQueue();

	}

}
