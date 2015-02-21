package it.tech.skal.algorithms.doublyLinkedList;



public class DoublyLinkedList {

	private Neighbor firstNeighbor;

	private Neighbor lastNeighbor;

	public void insertAtFirstPosition(String houseName, int houseNumber) {

		Neighbor newNeighbour = new Neighbor(houseName, houseNumber);

		if (isStreetEmpty()) {
			newNeighbour.setPrevious(firstNeighbor);
			lastNeighbor = newNeighbour;
			newNeighbour.setNext(firstNeighbor);
		} else {
			newNeighbour.setPrevious(null);
			lastNeighbor.setPrevious(newNeighbour);
			newNeighbour.setNext(lastNeighbor);
		}
		firstNeighbor = newNeighbour;

	}

	public void insertAtLastPosition(String houseName, int houseNumber) {

		Neighbor newNeighbour = new Neighbor(houseName, houseNumber);

		if (isStreetEmpty()) {
			newNeighbour.setPrevious(null);
			newNeighbour.setNext(null);
			firstNeighbor = newNeighbour;
			lastNeighbor = newNeighbour;
		} else {
			lastNeighbor.setNext(newNeighbour);
			newNeighbour.setPrevious(lastNeighbor);
			newNeighbour.setNext(null);
			lastNeighbor = newNeighbour;
		}

	}

	private boolean isStreetEmpty() {
		if (firstNeighbor == null && lastNeighbor == null) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {

		Neighbor theLink = firstNeighbor;

		while (theLink != null) {

			System.out.println("Previsous Link: " + theLink.getPrevious());
			System.out.println(theLink);
			System.out.println("Next Link: " + theLink.getNext());

			theLink = theLink.getNext();

			System.out.println("------------");

		}

	}

	private void displayNeighbors() {
		System.out.println("firstNeighbor:" + firstNeighbor);
		System.out.println("lastNeighbor:" + lastNeighbor);
		System.out.println();
		System.out.println();
	}

	public static void main(String a[]) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtFirstPosition("Sandeep", 9);
		dll.insertAtFirstPosition("Santosh", 10);
		dll.insertAtLastPosition("Arun", 11);
		dll.displayNeighbors();
		dll.display();

		// dll.insertAtFirstPosition("Santosh", 10);
	}

}
