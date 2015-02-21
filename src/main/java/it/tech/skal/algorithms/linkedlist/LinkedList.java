package it.tech.skal.algorithms.linkedlist;

public class LinkedList {
	
	Node nodeReference;
	
	public LinkedList() {
		nodeReference = null;
	}
	
	public boolean isEmpty(){
		if(nodeReference==null){
			return false;
		} else {
			return true;
		}
	}
	
	public void add(int nodeVal){
		
			Node newNode = new Node(nodeVal);
			newNode.linkReference = nodeReference;
			nodeReference = newNode;			
		
	}
	
	public void remove(int nodeVal){
		Node currentLink = null;
		Node prevLink = null;
		Node tempReference = nodeReference;
		while(tempReference!=null){
			if(nodeVal==find(nodeVal).getNodeValue()){
				tempReference.linkReference = find(nodeVal);				
			} else {
				tempReference = tempReference.linkReference;
			}
		}
	}
	
	public Node find(int nodeVal){ 
		Node nodeToBeFound = null;
		Node tempReference = nodeReference;
		if(tempReference!=null){
			if(tempReference.getNodeValue()==nodeVal){
				return tempReference;
			} else {
				tempReference = tempReference.getNextNode();
				while(tempReference!=null){
					if(tempReference.getNodeValue()==nodeVal){
						return tempReference;
					}
				}
			}
			
		}
		
		return nodeToBeFound;
	}
	
	public void display(){
		Node tempReference = nodeReference;
		while(tempReference!=null){
			System.out.println(tempReference);
			tempReference = tempReference.getNextNode();			
		}
	}

	public static void main(String args[]){
		LinkedList linkedList  = new LinkedList();
		
		linkedList.add(10);		
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.display();
		System.out.println("--------");
/*		Node nodeFound = linkedList.find(15);
		System.out.println(nodeFound);*/
		
		System.out.println("--------");
		linkedList.remove(50);
		linkedList.display();
		
	}
}
