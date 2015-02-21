package it.tech.skal.algorithms.doublyLinkedList;

public class DoublyLinkedList2 {

	private Neighbor firstNeighbor;

	private Neighbor lastNeighbor;

	public void insertAtFirstPosition(String houseName, int houseNumber) {

		Neighbor newNeighbour = new Neighbor(houseName, houseNumber);

		if (isStreetEmpty()) {
			lastNeighbor = newNeighbour;						
		} else {			
			newNeighbour.setNext(lastNeighbor);
			lastNeighbor.setPrevious(newNeighbour);
		}		
		firstNeighbor = newNeighbour;
		

	}

	public void insertAtLastPosition(String houseName, int houseNumber) {

		Neighbor newNeighbour = new Neighbor(houseName, houseNumber);

		if (isStreetEmpty()) {					
			firstNeighbor = newNeighbour;			
		} else {			
			lastNeighbor.setNext(newNeighbour);
			newNeighbour.setPrevious(lastNeighbor);
		}
		
		lastNeighbor = newNeighbour;
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
	
	public void insertBasedOnHouseNumber(String houseName,int houseNumber){
		Neighbor newNeighbour = new Neighbor(houseName, houseNumber);
		Neighbor tempNeighbor = firstNeighbor;
		while(tempNeighbor!=null){
			if (newNeighbour.getHouseNumber() > tempNeighbor.getHouseNumber()
					&& tempNeighbor.getNext().getHouseNumber() > newNeighbour
							.getHouseNumber()) {
				newNeighbour.setPrevious(tempNeighbor);
				newNeighbour.setNext(tempNeighbor.getNext());
				tempNeighbor.getNext().setPrevious(newNeighbour);
				tempNeighbor.setNext(newNeighbour);
			}
			tempNeighbor = tempNeighbor.getNext();
		}
		
	}

	private void displayNeighbors() {
		System.out.println("firstNeighbor:" + firstNeighbor);
		System.out.println("lastNeighbor:" + lastNeighbor);
		System.out.println();
		System.out.println();
	}

	public static void main(String a[]) {
		DoublyLinkedList2 dll = new DoublyLinkedList2();
		dll.insertAtFirstPosition("Sandeep", 9);
		dll.insertAtFirstPosition("Santosh", 10);
		dll.insertAtLastPosition("Arun", 14);
		
		dll.insertBasedOnHouseNumber("John", 13);
		dll.displayNeighbors();
		dll.display();
		// dll.insertAtFirstPosition("Santosh", 10);
	}

}
