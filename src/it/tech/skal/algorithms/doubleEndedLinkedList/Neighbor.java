package it.tech.skal.algorithms.doubleEndedLinkedList;

public class Neighbor {
	

	private String houseName;
	
	private int houseNumber;
	
	private Neighbor next;
	
	public Neighbor(String houseName,int houseNumber) {
		this.houseName = houseName;
		this.houseNumber =  houseNumber;
	}
	
	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public Neighbor getNext() {
		return next;
	}

	public void setNext(Neighbor next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.houseName;
	}


}
