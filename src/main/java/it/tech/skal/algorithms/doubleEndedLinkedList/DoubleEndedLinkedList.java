package it.tech.skal.algorithms.doubleEndedLinkedList;

public class DoubleEndedLinkedList {
	
	private Neighbor firstNeighbor;
	
	private Neighbor lastNeighbor;
	
	
	public void insertAtFirstPosition(String houseName, int houseNumber) {

		Neighbor newNeighbour = new Neighbor(houseName, houseNumber);

		if (isStreetEmpty()) {
			lastNeighbor = newNeighbour;
		}
		newNeighbour.setNext(firstNeighbor);
		firstNeighbor = newNeighbour;

	}
	
	public void insertAtLastPosition(String houseName, int houseNumber) {

		Neighbor newNeighbour = new Neighbor(houseName, houseNumber);

		if (isStreetEmpty()) {
			firstNeighbor = newNeighbour;
		}
		lastNeighbor.setNext(newNeighbour);
		lastNeighbor = newNeighbour;
	}


	private boolean isStreetEmpty() {
		if(firstNeighbor==null && lastNeighbor==null){
			return true;
		} else {
			return false;
		}
	}
	
	public void display(){
		
		Neighbor theLink = firstNeighbor;
			
		while(theLink != null){
				
			System.out.println(theLink);
				
			System.out.println("Next Link: " + theLink.getNext());
				
			theLink = theLink.getNext();
				
			System.out.println();
			
				
		}
			
	}

	private void displayNeighbors() {
		System.out.println("firstNeighbor:"+firstNeighbor);
		System.out.println("lastNeighbor:"+lastNeighbor);
	}	
	
	public static void main(String ap[]){
		DoubleEndedLinkedList dell = new DoubleEndedLinkedList();
		dell.insertAtFirstPosition("Sandeep", 11);
		dell.insertAtFirstPosition("Santosh", 14);
		dell.insertAtFirstPosition("John", 45);
		dell.insertAtLastPosition("Arun", 9);
		/*dell.insertAtFirstPosition("John", 45);*/
		dell.display();
		dell.displayNeighbors();
	}

}
